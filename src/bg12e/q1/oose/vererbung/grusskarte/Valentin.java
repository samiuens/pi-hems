package bg12e.q1.oose.vererbung.grusskarte;

public class Valentin extends Karte {
    private int anzahlKuesse;

    public Valentin(String empfaenger, int anzahlKuesse) {
        super(empfaenger);
        this.anzahlKuesse = anzahlKuesse;
    }

    @Override
    protected String gruesse() {
        String kuesse = "kuss ".repeat(anzahlKuesse);
        return "Dear %s, herzliche Gruesse und Kuesse. %s".formatted(this.empfaenger, kuesse);
    }
}
