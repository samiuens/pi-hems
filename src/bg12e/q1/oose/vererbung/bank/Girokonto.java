package bg12e.q1.oose.vererbung.bank;

public class Girokonto extends Konto {
    private double dispoMax;
    private static double dispoZinssatz;

    public Girokonto(String ktoNr, double dispoMax, double dispoZinssatz) {
        super(ktoNr);
        this.dispoMax = dispoMax;
        this.dispoZinssatz = dispoZinssatz;
    }

    public void setDispoZinssatz(double zinssatz) {
        if(zinssatz < 0) return;
        Girokonto.dispoZinssatz = zinssatz;
    }

    @Override
    protected double auszahlen(double betrag) {
        if(betrag > (ktoStand + dispoMax)) return -1;
        if(betrag > 0) {
            this.ktoStand -= betrag;
        }
        return this.ktoStand;
    }

    public double dispoBuchen() {
        if(this.ktoStand > 0) return -1;
        double dispoBetrag = Math.abs(this.ktoStand * (this.dispoZinssatz / 100));
        this.ktoStand -= dispoBetrag;
        System.out.println("Dispobetrag: %s bei %s Prozent".formatted(dispoBetrag, Girokonto.dispoZinssatz));
        return this.ktoStand;
    }

    @Override
    public String toString() {
        String superAuszug = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(superAuszug);
        sb.append(" (max. Dispo: %s; Dispozinssatz: %s Prozent) ".formatted(this.dispoMax, Girokonto.dispoZinssatz));
        return sb.toString();
    }
}
