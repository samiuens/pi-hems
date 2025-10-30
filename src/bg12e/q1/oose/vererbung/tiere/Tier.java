package bg12e.q1.oose.vererbung.tiere;

abstract public class Tier {
    protected String nahrung;
    protected boolean istLandtier;

    public Tier(String n, boolean i) {
        this.nahrung = n;
        this.istLandtier = i;
    }

    abstract protected String macheGeraeusch();
}
