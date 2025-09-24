package bg12e.q1.oose.fhverwaltung;

import java.util.Date;

public class Buchung {
    private static int autowert;
    private int buchungsNr;
    private Date von;
    private Date bis;
    private double preis;
    private Kunde kunde;
    private Ferienhaus objekt;

    public Buchung(Date von, Date bis, Ferienhaus fh, Kunde kd) {
        autowert++;
        this.buchungsNr = autowert;
        this.von = von;
        this.bis = bis;
        this.kunde = kd;
        this.objekt = fh;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public int getBuchungsNr() {
        return buchungsNr;
    }

    public void setBuchungsNr(int buchungsNr) {
        this.buchungsNr = buchungsNr;
    }

    public Date getVon() {
        return von;
    }

    public void setVon(Date von) {
        this.von = von;
    }

    public Date getBis() {
        return bis;
    }

    public void setBis(Date bis) {
        this.bis = bis;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public Ferienhaus getObjekt() {
        return objekt;
    }

    public void setObjekt(Ferienhaus objekt) {
        this.objekt = objekt;
    }
}
