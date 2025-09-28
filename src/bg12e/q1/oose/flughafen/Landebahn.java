package bg12e.q1.oose.flughafen;

public class Landebahn {
    private String bezeichnung;
    private Flugzeug flugzeug;

    public Landebahn(String b) {
        this.bezeichnung = b;
    }

    public void belegen(Flugzeug f) {
        if(istFrei()) {
            this.flugzeug = f;
        }
    }

    public boolean istFrei() {
        return flugzeug == null;
    }

    public boolean freigeben(Flugzeug f) {
        this.flugzeug = null;
        f.setLandebahn(null);
        return true;
    }

    public Flugzeug getFlugzeug() {
        return flugzeug;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    @Override
    public String toString() {
        String flugzeug = this.flugzeug == null ? "null" : this.flugzeug.getFlugnummer();
        return "Landebahn %s -> Flugzeug: %s".formatted(this.bezeichnung, flugzeug);
    }
}
