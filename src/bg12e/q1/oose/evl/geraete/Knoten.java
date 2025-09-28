package bg12e.q1.oose.evl.geraete;

public class Knoten {
    private Knoten nachfolger;
    private Geraet geraet;

    public Knoten(Geraet geraet) {
        this.geraet = geraet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String nachfolger = this.nachfolger == null ? "keiner" : String.valueOf(this.nachfolger.hashCode());
        String geraet = this.geraet == null ? "keins" : this.geraet.toString();
        sb.append("↳ Knoten (ID: %s) -> Nachfolger-ID: %s".formatted(String.valueOf(this.hashCode()), nachfolger)).append("\n");
        sb.append("\t").append("→ Gerät: %s".formatted(geraet));
        return sb.toString();
    }

    public Knoten getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(Knoten nachfolger) {
        this.nachfolger = nachfolger;
    }

    public Geraet getGeraet() {
        return geraet;
    }

    public void setGeraet(Geraet geraet) {
        this.geraet = geraet;
    }
}
