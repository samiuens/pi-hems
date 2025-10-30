package bg12e.q1.oose.vererbung.auto;

public class Auto {
    protected String kennzeichen;
    protected String marke;
    protected String modell;
    protected String farbe;
    protected int kmStand;

    public Auto(String kennzeichen, String marke, String modell, String farbe) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
        this.kmStand = 0;
    }

    public void fahren(int km) {
        if(km > 0) this.kmStand += km;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getKmStand() {
        return kmStand;
    }

    public void setKmStand(int kmStand) {
        this.kmStand = kmStand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auto: %s (%s, Farbe: %s) -> | %s | (%s km)".formatted(this.modell, this.marke, this.farbe, this.kennzeichen, this.kmStand));
        return sb.toString();
    }
}
