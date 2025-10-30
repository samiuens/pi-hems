package bg12e.q1.oose.vererbung.bank;

abstract public class Konto {
    protected String ktoNr;
    protected double ktoStand;

    public Konto(String ktoNr) {
        this.ktoNr = ktoNr;
        this.ktoStand = 0;
    }

    protected double einzahlen(double betrag) {
        if(betrag > 0) {
            this.ktoStand += betrag;
        }
        return this.ktoStand;
    }

    abstract protected double auszahlen(double betrag);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Konto (%s) -> %s Euro".formatted(this.ktoNr, this.ktoStand));
        return sb.toString();
    }
}
