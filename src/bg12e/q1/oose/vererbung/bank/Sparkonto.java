package bg12e.q1.oose.vererbung.bank;

public class Sparkonto extends Konto {
    private static double zinssatz = 2;

    public Sparkonto(String ktoNr) {
        super(ktoNr);
    }

    public void setZinssatz(double zinssatz) {
        if(zinssatz < 0) return;
        Sparkonto.zinssatz = zinssatz;
    }

    @Override
    protected double auszahlen(double betrag) {
        if(betrag > ktoStand) return -1;
        if(betrag > 0) {
            this.ktoStand -= betrag;
        }
        return this.ktoStand;
    }

    public double zinsenBuchen() {
        double zinsbetrag = this.ktoStand * (zinssatz / 100);
        this.ktoStand += zinsbetrag;
        System.out.println("Zinsbetrag: %s".formatted(zinsbetrag));
        return this.ktoStand;
    }

    @Override
    public String toString() {
        String superAuszug = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(superAuszug);
        sb.append(" (Zinssatz: %s Prozent) ".formatted(Sparkonto.zinssatz));
        return sb.toString();
    }
}
