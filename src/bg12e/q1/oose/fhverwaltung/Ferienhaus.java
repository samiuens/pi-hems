package bg12e.q1.oose.fhverwaltung;

import java.util.Date;
import java.util.LinkedList;

public class Ferienhaus {
    private static int autowert = 0;
    private int nr;
    private int maxPersonen;
    private int[] tagesPreise;
    private Region region;
    private Adresse adresse;
    private LinkedList<Buchung> buchungen;

    public Ferienhaus(Region region, Adresse adr, int maxP, int[] tagesPreise) {
        autowert++;
        this.nr = autowert;
        this.maxPersonen = maxP;
        this.tagesPreise = tagesPreise;
        this.region = region;
        this.adresse = adr;
        this.buchungen = new LinkedList<>();
    }

    public double ermittlePreis(Date von, Date bis) {
        int dauer = Math.abs(bis.getDate() - von.getDate());
        System.out.println(dauer);
        int monthDiff = bis.getMonth() - von.getMonth();
        if(monthDiff > 0) {
            dauer += monthDiff * 30;
        }

        if(tagesPreise.length >= dauer) {
            return tagesPreise[dauer];
        } else {
            return tagesPreise[tagesPreise.length - 1];
        }
    }

    public void hinzufuegenBuchung(Buchung buchung) {
        buchungen.add(buchung);
    }

    public boolean istFrei(Date von, Date bis) {
        for(Buchung buc : buchungen) {
            if(buc.getVon().before(bis) || buc.getBis().after(von)) {
                return false;
            }
        }
        return true;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public int getMaxPersonen() {
        return maxPersonen;
    }

    public void setMaxPersonen(int maxPersonen) {
        this.maxPersonen = maxPersonen;
    }

    public int[] getTagesPreise() {
        return tagesPreise;
    }

    public void setTagesPreise(int[] tagesPreise) {
        this.tagesPreise = tagesPreise;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public LinkedList<Buchung> getBuchungen() {
        return buchungen;
    }

    public void setBuchungen(LinkedList<Buchung> buchungen) {
        this.buchungen = buchungen;
    }
}
