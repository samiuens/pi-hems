package bg12e.q1.oose.vererbung.auto;

public class Cabriolet extends Auto {
    private boolean offen;
    private String verdeckmaterial;

    public Cabriolet(String kennzeichen, String marke, String modell, String verdeckmaterial, String farbe) {
        super(kennzeichen, marke, modell, farbe);
        this.verdeckmaterial = verdeckmaterial;
        this.offen = false;
    }

    public void oeffneVerdeck() {
        this.offen = true;
    }

    public void schliesseVerdeck() {
        this.offen = false;
    }

    public boolean isOffen() {
        return this.offen;
    }

    public String getVerdeckmaterial() {
        return this.verdeckmaterial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String offen = this.offen ? "offen" : "geschlossen";
        sb.append("Auto: %s (%s, Farbe: %s, %s) -> | %s | (%s km, Verdeckmaterial: %s)".formatted(this.modell, this.marke, this.farbe, offen, this.kennzeichen, this.kmStand, this.verdeckmaterial));
        return sb.toString();
    }
}
