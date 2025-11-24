package bg12e.q1.oose.uml.sd.krankenhausmanagement;

import java.util.LinkedList;
import java.util.List;

public class Krankenhaus {
    private String bezeichnung;
    private List<Abteilung> abteilungen;

    public Krankenhaus(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.abteilungen = new LinkedList<>();
    }

    public void anmeldenPatient(Patient patient, Abteilung abteilung) {
        abteilung.aufnehmenPatient(patient);
    }

    public void hinzufuegen(Abteilung abteilung) {
        this.abteilungen.add(abteilung);
    }

    public String erstelleRechnung(Patient p) {
        return "";
    }

    public List<Operation> priorisierteOperationen() {
        List<Operation> prioOps = new LinkedList<>();
        for(Abteilung abteilung : abteilungen) {
            List<Operation> operationen = abteilung.getOperationen();
            Operation op1 = operationen.getFirst();
            Operation op2 = operationen.get(1);

            for(Operation operation : operationen) {
                if(operation.wurdeDurchgefuehrt()) continue;
                if(getOpPrio(operation) > getOpPrio(op1)) {
                    op2 = op1;
                    op1 = operation;
                } else if(getOpPrio(operation) > getOpPrio(op2) && getOpPrio(operation) < getOpPrio(op1)) {
                    op2 = operation;
                }
            }
            prioOps.add(op1);
            prioOps.add(op2);
        }
        return prioOps;
    }

    private int getOpPrio(Operation operation) {
        return operation.getIndikation().getPrioritaet();
    }

    // Getter- und Setter-Methoden
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public List<Abteilung> getAbteilungen() {
        return abteilungen;
    }

    public void setAbteilungen(List<Abteilung> abteilungen) {
        this.abteilungen = abteilungen;
    }
}
