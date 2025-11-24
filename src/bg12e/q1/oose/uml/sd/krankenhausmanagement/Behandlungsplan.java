package bg12e.q1.oose.uml.sd.krankenhausmanagement;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Behandlungsplan {
    private LocalDate erstellungsdatum;
    private Patient patient;
    private List<Operation> operationen;

    public Behandlungsplan(Patient patient) {
        this.erstellungsdatum = LocalDate.now();
        this.patient = patient;
        this.operationen = new LinkedList<>();
    }

    // Getter- und Setter-Methoden
    public LocalDate getErstellungsdatum() {
        return erstellungsdatum;
    }

    public void setErstellungsdatum(LocalDate erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Operation> getOperationen() {
        return operationen;
    }

    public void setOperationen(List<Operation> operationen) {
        this.operationen = operationen;
    }
}
