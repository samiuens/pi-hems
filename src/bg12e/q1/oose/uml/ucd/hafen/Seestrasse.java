package bg12e.q1.oose.uml.ucd.hafen;

public class Seestrasse {
    private String bezeichnung;
    private Schiff schiff;

    public Seestrasse(String b) {
        this.bezeichnung = b;
    }

    public void belegen(Schiff s) {
        this.schiff = s;
    }

    public void freigeben() {
        this.schiff = null;
    }

    public boolean istFrei() {
        return this.schiff == null;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Schiff getSchiff() {
        return schiff;
    }

    public void setSchiff(Schiff schiff) {
        this.schiff = schiff;
    }
}
