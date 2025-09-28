package bg12e.q1.oose.evl.kunden;

public class Knoten {
    private Kunde kunde;
    private Knoten nachfolger;
    private boolean ersteKnoten;

    public Knoten(Kunde k) {
        this.kunde = k;
    }

    public Knoten(Kunde k, boolean ersteKnoten) {
        this.kunde = k;
        this.ersteKnoten = ersteKnoten;
    }

    public Kunde getKunde() {
        if(this.kunde == null) return null;
        return this.kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Knoten getNachfolger() {
        if(this.nachfolger == null) return null;
        return this.nachfolger;
    }

    public void setNachfolger(Knoten nachfolger) {
        this.nachfolger = nachfolger;
    }

    @Override
    public String toString() {
        String nachfolgerHashCode = "NULL";
        String nachfolgerString = "";
        if(nachfolger != null) {
            nachfolgerHashCode = String.valueOf(nachfolger.hashCode());
            nachfolgerString = nachfolger.toString();
        }

        return "Knoten-ID: %s;\t-> Kunde: %s (%s; Umsatz: %s)\t-> Nachfolger-ID: %s\n%s".formatted(this.hashCode(), this.kunde.getName(), this.kunde.isIstVIP(), this.kunde.getUmsatz(), nachfolgerHashCode, nachfolgerString);
    }
}
