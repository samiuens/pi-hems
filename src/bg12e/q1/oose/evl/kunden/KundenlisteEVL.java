package bg12e.q1.oose.evl.kunden;

public class KundenlisteEVL {
    private int anzahl;
    private Knoten ersterKnoten;

    public KundenlisteEVL() {
        this.ersterKnoten = null;
    }

    public boolean hinzufuegen(Kunde k) {
        if(ersterKnoten == null) {
            ersterKnoten = new Knoten(k, true);
            anzahl++;
            return true;
        }
        Knoten letzterKnoten = getLetztenKnoten();
        letzterKnoten.setNachfolger(new Knoten(k));
        anzahl++;
        return true;
    }

    public boolean entfernen(Kunde k) {
        if(this.ersterKnoten == null) return false;
        if(this.ersterKnoten.getKunde().equals(k)) {
            this.ersterKnoten = this.ersterKnoten.getNachfolger();
            anzahl--;
            return true;
        }

        int index = this.suchen(k.getName());
        Knoten knoten = getKnotenAtIndex(index);
        Knoten vorherigerKnoten = getKnotenAtIndex(index - 1);

        vorherigerKnoten.setNachfolger(knoten.getNachfolger());
        anzahl--;
        return true;
    }

    public boolean suchen(Kunde k) {
        Knoten aktuellerKnoten = ersterKnoten;
        while (aktuellerKnoten != null) {
            if (aktuellerKnoten.getKunde().equals(k)) {
                return true;
            }
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }
        return false;
    }


    public int suchen(String n) {
        boolean gefunden = false;
        Knoten aktuellerKnoten = ersterKnoten;
        int index = 0;
        while(!gefunden) {
            if(aktuellerKnoten.getKunde().getName().equals(n)) {
                gefunden = true;
                break;
            } else if(aktuellerKnoten.getNachfolger() != null) {
                aktuellerKnoten = aktuellerKnoten.getNachfolger();
                index++;
            } else {
                break;
            }
        }
        return index;
    }

    public Knoten getKnotenAtIndex(int index) {
        Knoten aktuellerKnoten = ersterKnoten;
        for(int i = 0; i < anzahl; i++) {
            if(i == index) {
                return aktuellerKnoten;
            } else {
                aktuellerKnoten = aktuellerKnoten.getNachfolger();
            }
        }
        return null;
    }

    public Knoten getErsterKnoten() {
        if(this.ersterKnoten == null) return null;
        return this.ersterKnoten;
    }

    public Knoten getLetztenKnoten() {
        Knoten aktuellerKnoten = ersterKnoten;
        while(aktuellerKnoten.getNachfolger() != null) {
            aktuellerKnoten = aktuellerKnoten.getNachfolger();
        }
        return aktuellerKnoten;
    }

    public int getAnzahl() {
        return this.anzahl;
    }

    @Override
    public String toString() {
        String ersterKnotenHashCode = "NULL";
        if(this.ersterKnoten != null) {
            ersterKnotenHashCode = String.valueOf(this.ersterKnoten.hashCode());
        }

        return "Kundenliste (%s, Anzahl: %s);\t\t\t\t\t-> Erster Knoten: %s\n%s".formatted(this.hashCode(), this.anzahl, ersterKnotenHashCode, this.ersterKnoten);
    }
}
