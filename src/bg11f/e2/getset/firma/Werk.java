package bg11f.e2.getset.firma;

public class Werk {
    private String bezeichung;
    private double umsatz;
    private Produkt produkt;

    public Werk(String bezeichung) {
        this.bezeichung = bezeichung;
    }

    public double einstellenProduktion() {
        produkt = null;
        double umsatz = berechneGesamtumsatz();
        this.umsatz = 0;
        return umsatz;
    }

    // Bezeichnung
    public String getBezeichung() {
        return bezeichung;
    }
    public void setBezeichung(String bezeichung) {
        this.bezeichung = bezeichung;
    }

    // Umsatz
    public double berechneGesamtumsatz() {
        this.umsatz = produkt.getAnzahl() * produkt.getPreis();
        return umsatz;
    }

    // Produkt
    public Produkt getProdukt() {
        return produkt;
    }
    public void setProdukt(Produkt produkt) {
        this.produkt = produkt;
    }
    public Produkt erstelleProdukt(String name, double preis, int anzahl) {
        this.produkt = new Produkt(name, preis, anzahl);
        return produkt;
    }

    @Override
    public String toString() {
        return "%s: %s EUR -> %s".formatted(bezeichung, umsatz, produkt);
    }
}
