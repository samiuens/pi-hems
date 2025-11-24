package bg12e.q1.oose.uml.sd.firmenproduktion;

import java.util.LinkedList;
import java.util.List;

public class Firma {
    private String firmenname;
    private double gesamtumsatz;
    private List<Werk> werke;

    public Firma(String firmenname) {
        this.firmenname = firmenname;
        this.gesamtumsatz = 0;
        this.werke = new LinkedList<>();
    }

    public double berechneUmsatz() {
        this.gesamtumsatz = 0;
        for(Werk w : werke) {
            this.gesamtumsatz += w.berechneUmsatz();
        }
        return this.gesamtumsatz;
    }

    public void steuereProduktion(int limit) {
        for(Werk w : werke) {
            if(w.berechneUmsatz() < limit) {
                w.einstellenProduktion();
            }
        }
    }

    // Getter- und Setter-Methoden
    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    public double getGesamtumsatz() {
        return gesamtumsatz;
    }

    public void setGesamtumsatz(double gesamtumsatz) {
        this.gesamtumsatz = gesamtumsatz;
    }

    public List<Werk> getWerke() {
        return werke;
    }

    public void setWerke(List<Werk> werke) {
        this.werke = werke;
    }
}
