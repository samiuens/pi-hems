package bg11f.e2.getset.firma;

public class Produkt {
    private String produktName;
    private double preis;
    private int anzahl;

    public Produkt(String produktName, double preis, int anzahl) {
        this.produktName = produktName;
        this.preis = preis;
        this.anzahl = anzahl;
    }

    // Produktname
    public String getProduktName() {
        return produktName;
    }
    public void setProduktName(String produktName) {
        this.produktName = produktName;
    }

    // Preis
    public double getPreis() {
        return preis;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }

    // Anzahl
    public int getAnzahl() {
        return anzahl;
    }
    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    @Override
    public String toString() {
        return "%s: (%s EUR, %s Stück)".formatted(produktName, preis, anzahl);
    }
}
