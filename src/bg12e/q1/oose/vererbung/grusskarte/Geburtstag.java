package bg12e.q1.oose.vererbung.grusskarte;

public class Geburtstag extends Karte {
    private int alter;

    public Geburtstag(String empfaenger, int alter) {
        super(empfaenger);
        this.alter = alter;
    }

    @Override
    protected String gruesse() {
        return "Dear %s, alles Gute zum %s. Geburtstag.".formatted(this.empfaenger, this.alter);
    }
}
