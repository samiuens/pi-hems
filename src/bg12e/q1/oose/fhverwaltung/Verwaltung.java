package bg12e.q1.oose.fhverwaltung;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Verwaltung {
    private LinkedList<Region> regionen;
    private LinkedList<Ferienhaus> objekte;
    private LinkedList<Kunde> kunden;

    public Verwaltung() {
        this.regionen = new LinkedList<>();
        this.objekte = new LinkedList<>();
        this.kunden = new LinkedList<>();
    }

    public Ferienhaus sucheFerienhaus(int nr) {
        for (Ferienhaus fh : objekte) {
            if (fh.getNr() == nr) {
                return fh;
            }
        }
        return null;
    }

    public List<Ferienhaus> sucheFerienhaus(String regName, int anzPersonen, Date von, Date bis) {
        List<Ferienhaus> results = new LinkedList<>();
        Region region = sucheRegion(regName);
        for (Ferienhaus fh : region.getObjekte()) {
            if(fh.getMaxPersonen() >= anzPersonen && fh.istFrei(von, bis)) {
                results.add(fh);
            }
        }
        return results;
    }

    public Region sucheRegion(String name) {
        for (Region reg : regionen) {
            if(reg.getName().equalsIgnoreCase(name)) {
                return reg;
            }
        }
        return null;
    }

    public Region regionErstellen(String name, String land) {
        Region region = new Region(name, land);
        regionen.add(region);
        return region;
    }

    public Kunde kundeErstellen(String name, String vorname, Adresse adr) {
        Kunde kunde = new Kunde(name, vorname, adr);
        kunden.add(kunde);
        return kunde;
    }

    public Ferienhaus ferienhausErstellen(Region region, Adresse adresse, int maxPersonen, int[] tagespreise) {
        if(!regionen.contains(region)) {
            System.out.println("Region existiert nicht im System!");
            return null;
        }

        Ferienhaus ferienhaus = new Ferienhaus(region, adresse, maxPersonen, tagespreise);
        region.hinzufuegenObjekt(ferienhaus);
        objekte.add(ferienhaus);
        return ferienhaus;
    }

    public Buchung buchen(Ferienhaus fh, Kunde kd, Date von, Date bis) {
        if(!objekte.contains(fh)) {
            System.out.println("Ferienhaus existiert nicht im System!");
            return null;
        }

        boolean isFhFrei = fh.istFrei(von, bis);
        Buchung buchung = new Buchung(von, bis, fh, kd);
        fh.hinzufuegenBuchung(buchung);
        kd.hinzufuegenBuchung(buchung);
        return buchung;
    }

    public static void main(String[] args) {
        Verwaltung v = new Verwaltung();
        Kunde k1 = v.kundeErstellen("Mustermann", "Max", new Adresse("Musterstraße 2", 11111, "Musterstadt"));
        Region rg1 = v.regionErstellen("Frankfurt", "Deutschland");
        Adresse ad_fh1 = new Adresse("Alsfelder-Straße 22", 12345, "Darmstadt");
        int[] fh1_tp = {100, 95, 90, 80, 75};
        Ferienhaus fh1 = v.ferienhausErstellen(rg1, ad_fh1, 5, fh1_tp);

        Buchung b1 = v.buchen(fh1, k1, new Date(2025, Calendar.OCTOBER, 15), new Date(2025, Calendar.NOVEMBER, 29));
        System.out.println(fh1.istFrei(new Date(2025, Calendar.OCTOBER, 15), new Date(2025, Calendar.OCTOBER, 22)));
        System.out.println(fh1.istFrei(new Date(2025, Calendar.OCTOBER, 24), new Date(2025, Calendar.OCTOBER, 25)));
        System.out.println(fh1.ermittlePreis(b1.getVon(), b1.getBis()));
    }
}
