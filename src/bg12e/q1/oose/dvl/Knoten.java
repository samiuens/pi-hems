package bg12e.q1.oose.dvl;

public class Knoten {
    private Knoten vorgaenger;
    private Knoten nachfolger;
    private Kunde kunde;

    public Knoten(Kunde k) {
        this.vorgaenger = null;
        this.nachfolger = null;
        this.kunde = k;
    }

    public Knoten getVorgaenger() {
        return vorgaenger;
    }

    public void setVorgaenger(Knoten vorgaenger) {
        this.vorgaenger = vorgaenger;
    }

    public Knoten getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(Knoten nachfolger) {
        this.nachfolger = nachfolger;
    }

    public Kunde getKunde() {
        return kunde;
    }

    @Override
    public String toString() {
        String hashCodeVorgaenger = this.vorgaenger == null ? "kein Vorgänger <- " : this.vorgaenger.hashCode() + " <- ";
        String hashCodeNachfolger = this.nachfolger == null ? " -> kein Nachfolger" : " -> " + this.nachfolger.hashCode();
        return "%sKnoten \"%s\"%s\n\t↳ Kunde: %s\n".formatted(hashCodeVorgaenger, this.hashCode(), hashCodeNachfolger, this.getKunde());
    }
}
