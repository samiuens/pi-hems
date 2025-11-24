package bg12e.q1.oose.uml.sd.krankenhausmanagement;

import java.util.LinkedList;
import java.util.List;

public class Abteilung {
    private String bezeichnung;
    private List<Zimmer> zimmerListe;
    private List<Patient> patienten;
    private List<Operation> operationen;

    public Abteilung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.zimmerListe = new LinkedList<>();
        this.patienten = new LinkedList<>();
        this.operationen = new LinkedList<>();
    }

    public boolean aufnehmenPatient(Patient patient) {
        return this.patienten.add(patient);
    }

    // Getter- und Setter-Methoden
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public List<Zimmer> getZimmerListe() {
        return zimmerListe;
    }

    public void setZimmerListe(List<Zimmer> zimmerListe) {
        this.zimmerListe = zimmerListe;
    }

    public List<Patient> getPatienten() {
        return patienten;
    }

    public void setPatienten(List<Patient> patienten) {
        this.patienten = patienten;
    }

    public List<Operation> getOperationen() {
        return operationen;
    }

    public void setOperationen(List<Operation> operationen) {
        this.operationen = operationen;
    }
}
