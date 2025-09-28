package bg12e.q1.oose.evl.geraete;

public class GeraetelisteEVL {
    private int anzahl;
    private Knoten erstesElement;

    public GeraetelisteEVL() {
        this.anzahl = 0;
        this.erstesElement = null;
    }

    public boolean hinzufuegen(Geraet g) {
        if(erstesElement == null) {
            erstesElement = new Knoten(g);
            anzahl++;
            return true;
        }

        Knoten aktuellerKnoten = erstesElement;
        while(aktuellerKnoten.getNachfolger() != null) {
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }
        aktuellerKnoten.setNachfolger(new Knoten(g));
        anzahl++;
        return true;
    }

    public boolean entfernen(String seriennummer) {
        Knoten aktuellerKnoten = erstesElement;
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
        if(erstesElement.getGeraet().equals(g)) {
            erstesElement = erstesElement.getNachfolger();
            return true;
        }

        Knoten gesuchterKnoten = erstesElement;
        Knoten vorgaenger = gesuchterKnoten;
        while(gesuchterKnoten != null && !gesuchterKnoten.getGeraet().equals(g)) {
            vorgaenger = gesuchterKnoten;
            gesuchterKnoten = gesuchterKnoten.getNachfolger();
        }
        if(gesuchterKnoten.getNachfolger() == null) {
            vorgaenger.setNachfolger(null);
        } else {
            vorgaenger.setNachfolger(gesuchterKnoten.getNachfolger());
        }
        anzahl--;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String erstesElement = this.erstesElement == null ? "keins" : String.valueOf(this.erstesElement.hashCode());
        String kopfzeile = "Geräteliste '%s' (Anzahl: %s) | \tErste-Element-ID: %s".formatted(String.valueOf(this.hashCode()), this.anzahl, erstesElement);
        sb.append(kopfzeile).append("\n\n");

        Knoten aktuellerKnoten = this.erstesElement;
        while(aktuellerKnoten != null) {
            sb.append(aktuellerKnoten).append("\n");
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }

        return sb.toString();
    }
}
