package bg12e.q1.oose.uml.sd.firmenproduktion;

public class Produkt {
    private String produktname;
    private double preis;
    private int anzahl;

    public Produkt(String produktname, double preis) {
        this.produktname = produktname;
        this.preis = preis;
        this.anzahl = 0;
    }

    // Getter- und Setter-Methoden
    public String getProduktname() {
        return produktname;
    }

    public void setProduktname(String produktname) {
        this.produktname = produktname;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}
