package bg12e.q1.oose.slz;

import java.util.Date;
import java.util.Random;

public class Reservierung {
    private int reservierungsNr;
    private Geraet geraet;
    private Schueler schueler;
    private Date vonDatum;
    private Date bisDatum;

    private Random rndm = new Random();

    public Reservierung(Geraet g, Schueler s, Date von, Date bis) {
        this.reservierungsNr = rndm.nextInt(100);
        this.geraet = g;
        this.schueler = s;
        this.vonDatum = von;
        this.bisDatum = bis;
    }

    // Getter- und Settermethoden
    public Date getBisDatum() {
        return bisDatum;
    }

    public void setBisDatum(Date bisDatum) {
        this.bisDatum = bisDatum;
    }

    public Date getVonDatum() {
        return vonDatum;
    }

    public void setVonDatum(Date vonDatum) {
        this.vonDatum = vonDatum;
    }

    public Schueler getSchueler() {
        return schueler;
    }

    public void setSchueler(Schueler schueler) {
        this.schueler = schueler;
    }

    public Geraet getGeraet() {
        return geraet;
    }

    public void setGeraet(Geraet geraet) {
        this.geraet = geraet;
    }

    public int getReservierungsNr() {
        return reservierungsNr;
    }

    public void setReservierungsNr(int reservierungsNr) {
        this.reservierungsNr = reservierungsNr;
    }
}
