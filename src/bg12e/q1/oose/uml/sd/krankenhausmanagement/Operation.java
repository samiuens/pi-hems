package bg12e.q1.oose.uml.sd.krankenhausmanagement;

import java.time.LocalDate;

public class Operation {
    private String bezeichnung;
    private LocalDate datum;
    private boolean durchgefuehrt;
    private Patient patient;
    private Indikation indikation;

    public Operation(String bez, LocalDate datum, Patient patient, Indikation indikation) {
        this.bezeichnung = bez;
        this.datum = datum;
        this.patient = patient;
        this.indikation = indikation;
    }

    public boolean wurdeDurchgefuehrt() {
        return this.durchgefuehrt;
    }

    // Getter- und Setter-Methoden

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public boolean isDurchgefuehrt() {
        return durchgefuehrt;
    }

    public void setDurchgefuehrt(boolean durchgefuehrt) {
        this.durchgefuehrt = durchgefuehrt;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Indikation getIndikation() {
        return indikation;
    }

    public void setIndikation(Indikation indikation) {
        this.indikation = indikation;
    }
}
