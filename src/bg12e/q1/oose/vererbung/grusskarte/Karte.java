package bg12e.q1.oose.vererbung.grusskarte;

abstract public class Karte {
    protected String empfaenger;

    public Karte(String empfaenger) {
        this.empfaenger = empfaenger;
    }

    abstract protected String gruesse();
}
