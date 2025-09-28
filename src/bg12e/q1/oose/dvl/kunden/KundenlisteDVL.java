package bg12e.q1.oose.dvl.kunden;

public class KundenlisteDVL {
    private Knoten anfang;
    private Knoten ende;

    public KundenlisteDVL() {
        this.anfang = null;
        this.ende = null;
    }

    public boolean istLeer() {
        return anfang == null && ende == null;
    }

    public boolean hinzufuegen(Kunde k) {
        if(istLeer()) {
            this.anfang = new Knoten(k);
            this.ende = this.anfang;
            return true;
        }

        if(ende.equals(anfang)) {
            this.ende = new Knoten(k);
            this.ende.setVorgaenger(this.anfang);
            this.anfang.setNachfolger(this.ende);
            return true;
        }

        Knoten neuerKnoten = new Knoten(k);
        this.ende.setNachfolger(neuerKnoten);
        neuerKnoten.setVorgaenger(this.ende);
        this.ende = neuerKnoten;

        return false;
    }

    public boolean entfernen(Kunde k) {
        if(istLeer()) {
            return false;
        }

        if(anfang.getKunde().equals(k)) {
            this.anfang = this.anfang.getNachfolger();
            this.anfang.setVorgaenger(null);
            return true;
        }

        if(ende.getKunde().equals(k)) {
            this.ende.getVorgaenger().setNachfolger(null);
            this.ende = this.ende.getVorgaenger();
            return true;
        }

        Knoten aktuellerKnoten = this.anfang;
        while(aktuellerKnoten != null && !aktuellerKnoten.getKunde().equals(k)) {
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }

        if(aktuellerKnoten != null) {
            aktuellerKnoten.getVorgaenger().setNachfolger(aktuellerKnoten.getNachfolger());
            if (aktuellerKnoten.getNachfolger() != null) {
                aktuellerKnoten.getNachfolger().setVorgaenger(aktuellerKnoten.getVorgaenger());
            }
            return true;
        }
        return false;
    }

    public int entfernen(String name) {
        if(istLeer()) {
            return 0;
        }

        int anzahlZuEntfernen = 0;
        Knoten aktuellerKnoten = this.anfang;
        while(aktuellerKnoten != null) {
            if(aktuellerKnoten.getKunde().getName().equalsIgnoreCase(name)) {
                anzahlZuEntfernen++;
                entfernen(aktuellerKnoten.getKunde());
            }
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }
        return anzahlZuEntfernen;
    }

    public int liefereAnzahlElemente() {
        if(istLeer()) {
            return 0;
        }

        int anzahl = 1;
        Knoten aktuellerKnoten = anfang;
        while(aktuellerKnoten.getNachfolger() != null) {
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
            anzahl++;
        }
        return anzahl;
    }

    public int sucheIstVIP() {
        int anzahl = 0;
        Knoten aktuellerKnoten = this.anfang;
        while(aktuellerKnoten != null) {
            if(aktuellerKnoten.getKunde().isIstVIP()) {
                anzahl++;
            }
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }

        if(anzahl == 0) return -1;
        return anzahl;
    }

    public boolean suchen(Kunde k) {
        if(istLeer()) {
            return false;
        }

        boolean gefunden = false;
        Knoten aktuellerKnoten = this.anfang;
        while(aktuellerKnoten != null) {
            if (aktuellerKnoten.getKunde().equals(k)) {
                gefunden = true;
                break;
            }
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }
        return gefunden;
    }

    public Kunde[] liefereListeAlsFeld_Vorwaerts() {
        int anzahlKunden = liefereAnzahlElemente();
        Kunde[] liste = new Kunde[anzahlKunden];
        if(!istLeer()) {
            Knoten aktuellerKnoten = this.anfang;
            for(int i = 0; i < anzahlKunden; i++) {
                liste[i] = aktuellerKnoten.getKunde();
                aktuellerKnoten = aktuellerKnoten.getNachfolger();
            }
            return liste;
        }
        return new Kunde[0];
    }

    public Kunde[] liefereListeAlsFeld_Rueckwaerts() {
        int anzahlKunden = liefereAnzahlElemente();
        Kunde[] liste = new Kunde[anzahlKunden];
        if(!istLeer()) {
            Knoten aktuellerKnoten = this.ende;
            for(int i = 0; i < anzahlKunden; i++) {
                liste[i] = aktuellerKnoten.getKunde();
                aktuellerKnoten = aktuellerKnoten.getVorgaenger();
            }
            return liste;
        }
        return new Kunde[0];
    }

    @Override
    public String toString() {
        if(istLeer()) {
            String kopfzeile = "Liste %s; Anfang: null; Ende: null".formatted(this.hashCode());
            return kopfzeile;
        }

        StringBuilder sb = new StringBuilder();
        String kopfzeile = "Liste %s; Anfang: %s; Ende: %s".formatted(this.hashCode(), this.anfang.hashCode(), this.ende.hashCode());
        sb.append(kopfzeile).append("\n\n");

        Knoten aktueller = this.anfang;
        while (aktueller != null) {
            sb.append(aktueller).append("\n");
            aktueller = aktueller.getNachfolger();
        }
        return sb.toString();
    }
}
