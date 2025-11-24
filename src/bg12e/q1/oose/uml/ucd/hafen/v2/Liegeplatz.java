package bg12e.q1.oose.uml.ucd.hafen.v2;

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

    public void freigeben() {
        this.schiff = null;
    }

    public boolean istFrei() {
        return this.schiff == null;
    }

    public static int getZaehler() {
        return zaehler;
    }

    public static void setZaehler(int zaehler) {
        Liegeplatz.zaehler = zaehler;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public double getNutzungsGebuehr() {
        return nutzungsGebuehr;
    }

    public void setNutzungsGebuehr(double nutzungsGebuehr) {
        this.nutzungsGebuehr = nutzungsGebuehr;
    }

    public boolean isHatZollstation() {
        return hatZollstation;
    }

    public void setHatZollstation(boolean hatZollstation) {
        this.hatZollstation = hatZollstation;
    }

    public List<Integer> getLadungsarten() {
        return ladungsarten;
    }

    public void setLadungsarten(List<Integer> ladungsarten) {
        this.ladungsarten = ladungsarten;
    }

    public Schiff getSchiff() {
        return schiff;
    }

    public void setSchiff(Schiff schiff) {
        this.schiff = schiff;
    }
}
