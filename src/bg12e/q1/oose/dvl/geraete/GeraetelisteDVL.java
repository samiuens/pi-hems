package bg12e.q1.oose.dvl.geraete;

public class GeraetelisteDVL {
    private int anzahl;
    private Knoten anfang;
    private Knoten ende;

    public GeraetelisteDVL() {
        this.anzahl = 0;
        this.anfang = null;
        this.ende = null;
    }

    public boolean hinzufuegen(Geraet g) {
        if(anfang == null && ende == null) {
            anfang = new Knoten(g);
            ende = anfang;
            anfang.setNachfolger(ende);
            anzahl++;
            return true;
        }

        if(ende.equals(anfang)) {
            ende = new Knoten(g);
            ende.setVorgaenger(anfang);
            anfang.setNachfolger(ende);
            anzahl++;
            return true;
        }

        Knoten neuerKnoten = new Knoten(g);
        this.ende.setNachfolger(neuerKnoten);
        neuerKnoten.setVorgaenger(this.ende);
        this.ende = neuerKnoten;
        return true;
    }

    public boolean entfernen(String seriennummer) {
        Knoten aktuellerKnoten = anfang;
        Geraet gesuchtesGeraet = null;
        while(aktuellerKnoten != null) {
            if(aktuellerKnoten.getGeraet().getSeriennummer() != null && aktuellerKnoten.getGeraet().getSeriennummer().equals(seriennummer)) {
                gesuchtesGeraet = aktuellerKnoten.getGeraet();
                break;
            }
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }
        if(gesuchtesGeraet == null) return false;
        return entfernen(gesuchtesGeraet);
    }

    public boolean entfernen(Geraet g) {
        if(anfang.getGeraet().equals(g)) {
            this.anfang = this.anfang.getNachfolger();
            this.anfang.setVorgaenger(null);
            return true;
        }

        if(ende.getGeraet().equals(g)) {
            this.ende.getVorgaenger().setNachfolger(null);
            this.ende = this.ende.getVorgaenger();
            return true;
        }

        Knoten aktuellerKnoten = this.anfang;
        while(aktuellerKnoten != null && !aktuellerKnoten.getGeraet().equals(g)) {
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }

        if(aktuellerKnoten != null) {
            aktuellerKnoten.getVorgaenger().setNachfolger(aktuellerKnoten.getNachfolger());
            if (aktuellerKnoten.getNachfolger() != null) {
                aktuellerKnoten.getNachfolger().setVorgaenger(aktuellerKnoten.getVorgaenger());
            }
            return true;
        }
        anzahl--;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String erstesElement = this.anfang == null ? "keine" : String.valueOf(this.anfang.hashCode());
        String letztesElement = this.ende == null ? "keine" : String.valueOf(this.ende.hashCode());
        String kopfzeile = "Geräteliste '%s' (Anzahl: %s) | \tErste-Element-ID: %s\tLetzte-Element-ID: %s".formatted(String.valueOf(this.hashCode()), this.anzahl, erstesElement, letztesElement);
        sb.append(kopfzeile).append("\n\n");

        Knoten aktuellerKnoten = this.anfang;
        while(aktuellerKnoten != null) {
            sb.append(aktuellerKnoten).append("\n");
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }

        return sb.toString();
    }
}
