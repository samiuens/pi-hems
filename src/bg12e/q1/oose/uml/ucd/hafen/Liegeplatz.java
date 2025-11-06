package bg12e.q1.oose.uml.ucd.hafen;

import java.util.LinkedList;
import java.util.List;

public class Liegeplatz {
    private static int zaehler = 1;
    private int nummer;
    private double nutzungsGebuehr;
    private boolean hatZollstation;
    private List<Integer> ladungsarten;
    private Schiff schiff;

    public Liegeplatz(double ng, int ladungsart) {
        this.nummer = zaehler;
        zaehler++;
        this.nutzungsGebuehr = ng;
        this.hatZollstation = false;
        this.ladungsarten = new LinkedList<>();
        this.ladungsarten.add(ladungsart);
    }

    public boolean hinzufuegen(int ladungsart) {
        return this.ladungsarten.add(ladungsart);
    }

    public void entfernen(Integer ladungsart) {
        this.ladungsarten.remove(ladungsart);
    }

    public boolean belegen(Schiff s) {
        this.schiff = s;
        return true;
    }

    public void freigeben() {}
}
