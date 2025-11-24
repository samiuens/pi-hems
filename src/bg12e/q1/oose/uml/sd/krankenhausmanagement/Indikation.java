package bg12e.q1.oose.uml.sd.krankenhausmanagement;

public class Indikation {
    private String bezeichnung;
    private int prioritaet;

    public Indikation(String bezeichnung, int prioritaet) {
        this.bezeichnung = bezeichnung;
        this.prioritaet = prioritaet;
    }

    // Getter- und Setter-Methoden
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getPrioritaet() {
        return prioritaet;
    }

    public void setPrioritaet(int prioritaet) {
        this.prioritaet = prioritaet;
    }
}
