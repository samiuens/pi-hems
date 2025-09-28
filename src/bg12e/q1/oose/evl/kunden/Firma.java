package bg12e.q1.oose.evl.kunden;

import java.util.LinkedList;

public class Firma {
    private String bezeichnung;
    private KundenlisteEVL kundenliste;
    private LinkedList<Kunde> vertriebsliste;
    private Kunde[] pruefliste;

    public Firma(String b) {
        this.bezeichnung = b;
        this.kundenliste = null;
        this.vertriebsliste = new LinkedList<>();
        this.pruefliste = new Kunde[5];
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public KundenlisteEVL getKundenliste() {
        return kundenliste;
    }

    public void setKundenliste(KundenlisteEVL kundenliste) {
        this.kundenliste = kundenliste;
    }

    public int aktualisiereVL() {
        LinkedList<Kunde> klon = new LinkedList<>();

        Knoten aktuellerKnoten = kundenliste.getErsterKnoten();
        while(aktuellerKnoten != null) {
            klon.add(aktuellerKnoten.getKunde());
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }

        while(!klon.isEmpty()) {
            Kunde max = klon.getFirst();
            for(int i = 0; i < klon.size(); i++) {
                Kunde aktuellerKunde = klon.get(i);
                if(aktuellerKunde.getUmsatz() > max.getUmsatz()) {
                    max = aktuellerKunde;
                }
            }
            klon.remove(max);
            vertriebsliste.add(max);
        }

        return vertriebsliste.size();
    }

    public int aktualisierePL() {
        LinkedList<Kunde> klon = new LinkedList<>();

        for(Kunde kunde : vertriebsliste) {
            klon.add(kunde);
        }

        int j = 0;
        while(!klon.isEmpty() && j < pruefliste.length) {
            Kunde min = klon.getFirst();
            for(int i = 0; i < klon.size(); i++) {
                Kunde aktuellerKunde = klon.get(i);
                if(aktuellerKunde.getUmsatz() < min.getUmsatz()) {
                    min = aktuellerKunde;
                }
            }
            klon.remove(min);
            pruefliste[j] = min;
            j++;
        }

        return pruefliste.length;
    }

    public String toStringVL() {
        StringBuilder sb = new StringBuilder();
        String kopfzeile = "Vertriebsliste der Firma: %s".formatted(bezeichnung);
        sb.append(kopfzeile).append("\n");
        for(Kunde kunde : vertriebsliste) {
            sb.append("\t").append("- %s mit Umsatz %s Euro".formatted(kunde.getName(), kunde.getUmsatz())).append("\n");
        }
        return sb.toString();
    }

    public String toStringPL() {
        StringBuilder sb = new StringBuilder();
        String kopfzeile = "Pruefliste der Firma: %s".formatted(bezeichnung);
        sb.append(kopfzeile).append("\n");
        for(Kunde kunde : pruefliste) {
            if(kunde != null) {
                sb.append("\t").append("- %s mit Umsatz %s Euro".formatted(kunde.getName(), kunde.getUmsatz())).append("\n");
            }
        }
        return sb.toString();
    }

    public String toString() {
        int anzahlPL = 0;
        for(int i = 0; i < pruefliste.length; i++) {
            if(pruefliste[i] != null) anzahlPL++;
        }

        return "Firma: %s (KL: %s, VL: %s, PL: %s)".formatted(this.bezeichnung, kundenliste.getAnzahl(), vertriebsliste.size(), anzahlPL);
    }
}
