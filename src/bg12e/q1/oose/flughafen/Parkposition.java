package bg12e.q1.oose.flughafen;

public class Parkposition {
    private int nummer;
    private int gebuehr;
    private boolean hatZollstation;
    private boolean hatFrachtentladung;
    private Flugzeug flugzeug;

    public Parkposition(int n, int g, boolean hZ, boolean hF) {
        this.nummer = n;
        this.gebuehr = g;
        this.hatZollstation = hZ;
        this.hatFrachtentladung = hF;
    }

    public int getNummer() {
        return this.nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public boolean belegen(Flugzeug f) {
        if(f.getStatus().equals("LANDEANFLUG") && flugzeug == null) {
            this.flugzeug = f;
            return true;
        }
        return false;
    }

    public boolean freigeben(String fNr) {
        if(flugzeug.getFlugnummer().equals(fNr)) {
            this.flugzeug = null;
            return true;
        }
        return false;
    }

    public double erstelleRechnung(int standzeit) {
        if(standzeit > 0) {
            return ((double) standzeit / 60) * this.gebuehr;
        };
        return -1;
    }

    public Flugzeug getFlugzeug() {
        return flugzeug;
    }

    public void setFlugzeug(Flugzeug flugzeug) {
        this.flugzeug = flugzeug;
    }

    public boolean isHatFrachtentladung() {
        return hatFrachtentladung;
    }

    public boolean isHatZollstation() {
        return hatZollstation;
    }

    @Override
    public String toString() {
        String flugzeug = this.flugzeug == null ? "null" : this.flugzeug.getFlugnummer();
        return "Parkposition %s (%s Euro/Stunde, Zollstation: %s, Frachtentladung: %s) -> Flugzeug: %s".formatted(this.nummer, this.gebuehr, this.hatZollstation, this.hatFrachtentladung, flugzeug);
    }
}
