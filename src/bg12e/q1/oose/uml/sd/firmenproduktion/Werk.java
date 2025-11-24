package bg12e.q1.oose.uml.sd.firmenproduktion;

public class Werk {
    private String bezeichnung;
    private double umsatz;
    private Produkt produkt;

    public Werk(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.umsatz = 0;
        this.produkt = null;
    }

    public double berechneUmsatz() {
        if(produkt == null) return -1;
        double produktPreis = this.produkt.getAnzahl() * this.produkt.getPreis();
        this.umsatz = produktPreis;
        return produktPreis;
    }

    public double einstellenProduktion() {
        this.produkt = null;
        return umsatz;
    }

    // Getter- und Setter-Methoden
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }
}
