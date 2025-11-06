package bg12e.q1.oose.uml.ucd.hafen;

public class Seestrasse {
    private String bezeichnung;
    private Schiff schiff;

    public Seestrasse(String b) {
        this.bezeichnung = b;
    }

    public void belegen(Schiff s) {}

    public boolean istFrei() {
        return false;
    }
}
