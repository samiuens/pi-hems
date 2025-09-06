package bg12e.q1.oose.slz;

import java.util.Date;
import java.util.LinkedList;

public class Geraetetyp {
    private int geraetetypNr;
    private String bezeichnung;
    private LinkedList<Geraet> geraete;

    public Geraetetyp(int typNr, String bezeichnung) {
        this.geraetetypNr = typNr;
        this.bezeichnung = bezeichnung;
        this.geraete = new LinkedList<>();
    }

    public void erfasseGeraet() {
        Geraet geraet = new Geraet(this);
        geraete.add(geraet);
    }

    public Geraet sucheFreiesGeraet(Date von, Date bis) {
        for(int i = 0; i < geraete.size(); i++) {
            Geraet g = geraete.get(i);
            if(g.istFrei(von, bis)) {
                return g;
            }
        }
        return null;
    }

    // Getter- und Settermethoden
    public int getGeraetetypNr() {
        return geraetetypNr;
    }

    public void setGeraetetypNr(int geraetetypNr) {
        this.geraetetypNr = geraetetypNr;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public LinkedList<Geraet> getGeraete() {
        return geraete;
    }

    public void setGeraete(LinkedList<Geraet> geraete) {
        this.geraete = geraete;
    }
}
