package bg11f.e2.getset.warenhaus;

public class Ware {
    private String bezeichnung;
    private double preis;

    public Ware(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public String getBezeichnung() {
        return this.bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        if (preis >= 0) {
            this.preis = preis;
        } else {
            System.out.println("Preis kann nicht negativ sein.");
        }
    }

    @Override
    public String toString() {
        return "Ware: %s (Preis: %s Euro)".formatted(this.bezeichnung, this.preis);
    }
}
