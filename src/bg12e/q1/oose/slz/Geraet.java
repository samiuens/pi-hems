package bg12e.q1.oose.slz;

import java.util.Date;
import java.util.LinkedList;

public class Geraet {
    private int gerateNr;
    private boolean einsatzBereit;
    private Geraetetyp geraetetyp;
    private LinkedList<Reservierung> reservierungen;

    public Geraet(Geraetetyp typ) {
        this.gerateNr = typ.getGeraetetypNr() + (typ.getGeraete().size() + 1);
        this.einsatzBereit = true;
        this.geraetetyp = typ;
        this.reservierungen = new LinkedList<>();
    }

    public void hinzufuegenReservierung(Reservierung res) {
        reservierungen.add(res);
    }

    public boolean loescheReservierung(Reservierung r) {
        for(int i = 0; i < reservierungen.size(); i++) {
            Reservierung res = reservierungen.get(i);
            if(res.getReservierungsNr() == r.getReservierungsNr()) {
                reservierungen.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean istFrei(Date von, Date bis) {
        for(int i = 0; i < reservierungen.size(); i++) {
            Reservierung res = reservierungen.get(i);
            if(res.getVonDatum().before(bis) || res.getBisDatum().after(von)) {
                return true;
            }
        }
        return false;
    }

    // Getter- und Settermethoden
    public int getGerateNr() {
        return gerateNr;
    }

    public void setGerateNr(int gerateNr) {
        this.gerateNr = gerateNr;
    }

    public boolean isEinsatzBereit() {
        return einsatzBereit;
    }

    public void setEinsatzBereit(boolean einsatzBereit) {
        this.einsatzBereit = einsatzBereit;
    }

    public Geraetetyp getGeraetetyp() {
        return geraetetyp;
    }

    public void setGeraetetyp(Geraetetyp geraetetyp) {
        this.geraetetyp = geraetetyp;
    }

    public LinkedList<Reservierung> getReservierungen() {
        return reservierungen;
    }

    public void setReservierungen(LinkedList<Reservierung> reservierungen) {
        this.reservierungen = reservierungen;
    }
}
