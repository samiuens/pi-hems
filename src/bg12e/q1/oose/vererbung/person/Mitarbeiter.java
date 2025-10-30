package bg12e.q1.oose.vererbung.person;

public class Mitarbeiter extends Person {
    private int personalnr;

    public Mitarbeiter(String name, String gebDatum, String adresse, int personalnr) {
        super(name, gebDatum, adresse);
        this.personalnr = personalnr;
    }

    public int getPersonalnr() {
        return personalnr;
    }

    public void setPersonalnr(int personalnr) {
        this.personalnr = personalnr;
    }
}
