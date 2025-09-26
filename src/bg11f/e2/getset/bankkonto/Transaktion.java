package bg11f.e2.getset.bankkonto;

public class Transaktion {
    private final Konto sender;
    private final double betrag;
    private final String verwendungszweck;
    private final Konto empfaenger;

    public Transaktion(Konto sender, double betrag, String verwendungszweck, Konto empfaenger) {
        this.sender = sender;
        this.betrag = betrag;
        this.verwendungszweck = verwendungszweck;
        this.empfaenger = empfaenger;
    }
}
