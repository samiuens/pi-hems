package bg12e.q1.oose.slz;

import java.util.Date;
import java.util.LinkedList;

public class SLZVerwaltung {
    private LinkedList<Geraetetyp> typen;
    private LinkedList<Reservierung> reservierungen;
    private LinkedList<Schueler> schueler;

    public SLZVerwaltung() {
        this.typen = new LinkedList<>();
        this.reservierungen = new LinkedList<>();
        this.schueler = new LinkedList<>();
    }

    public Geraet sucheFreiesGeraetVonTyp(int typNr, Date von, Date bis){
        for (int i = 0; i < typen.size(); i++) {
            Geraetetyp t = typen.get(i);
            if(t.getGeraetetypNr() == typNr){
                return typen.get(i).sucheFreiesGeraet(von, bis);
            }
        }
        return null;
    }

    public Reservierung reservieren(int typNr, Date von, Date bis, Schueler schueler) {
        Geraet g = sucheFreiesGeraetVonTyp(typNr, von, bis);
        reservierungen.add(new Reservierung(g, schueler, von, bis));
        return reservierungen.getLast();
    }

    public Schueler sucheSchueler(int ausweisNr) {
        for(int i = 0; i < schueler.size(); i++) {
            Schueler s = schueler.get(i);
            if(s.getAusweisNr() == ausweisNr) {
                return s;
            }
        }
        return null;
    }

    public Reservierung sucheReservierung(int resNr) {
        for(int i = 0; i < reservierungen.size(); i++) {
            Reservierung r = reservierungen.get(i);
            if(r.getReservierungsNr() == resNr) {
                return r;
            }
        }
        return null;
    }

    // Getter- und Settermethoden
    public LinkedList<Geraetetyp> getTypen() {
        return typen;
    }

    public void setTypen(LinkedList<Geraetetyp> typen) {
        this.typen = typen;
    }

    public LinkedList<Reservierung> getReservierungen() {
        return reservierungen;
    }

    public void setReservierungen(LinkedList<Reservierung> reservierungen) {
        this.reservierungen = reservierungen;
    }

    public LinkedList<Schueler> getSchueler() {
        return schueler;
    }

    public void setSchueler(LinkedList<Schueler> schueler) {
        this.schueler = schueler;
    }
}
