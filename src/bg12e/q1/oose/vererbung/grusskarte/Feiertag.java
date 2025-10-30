package bg12e.q1.oose.vererbung.grusskarte;

public class Feiertag extends Karte {
    public Feiertag(String empfaenger) {
        super(empfaenger);
    }

    @Override
    protected String gruesse() {
        return "Dear %s, frohe Feiertage.".formatted(this.empfaenger);
    }
}
