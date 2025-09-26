package bg11f.e2.methoden;

public class Warenkorb {
    public static void main(String[] args) {
        Warenkorb w = new Warenkorb();
        double[] preise = { 25.0, 99.1, 1051.3, 12.3, 5.99 };
        System.out.println(w.berechneGesamtpreis(preise, 0, true));
    }

    public double berechneGesamtpreis(double[] preise) {
        double ergebnis = 0;
        for (int i = 0; i < preise.length; i++) {
            ergebnis += preise[i];
        }
        return ergebnis;
    }

    public double berechneGesamtpreis(double[] preise, double rabattProzent) {
        double ergebnis = 0;
        for (int i = 0; i < preise.length; i++) {
            ergebnis += preise[i];
        }
        if (rabattProzent > 0) ergebnis = rabattProzent * ergebnis / 100;
        return ergebnis;
    }

    public double berechneGesamtpreis(double[] preise, double rabattProzent, boolean mwstSteuer) {
        double ergebnis = 0;
        for (int i = 0; i < preise.length; i++) {
            ergebnis += preise[i];
        }
        if (rabattProzent > 0) ergebnis = rabattProzent * ergebnis / 100;
        if (mwstSteuer) ergebnis *= 1.19;
        return ergebnis;
    }
}
