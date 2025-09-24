package bg12e.q1.oose.klassenattribute;

public class Mitarbeiter {
    private static int zaehler = 99999;
    private int personalnummer;
    private String name;
    private double gehalt;

    public Mitarbeiter(String name, double gehalt) {
        zaehler++;
        this.personalnummer = zaehler;
        this.name = name;
        this.gehalt = gehalt;
    }

    public void erhoeheGehalt(double betrag) {
        this.gehalt += betrag;
    }

    @Override
    public String toString() {
        return "%s (%s) -> %s Euro".formatted(personalnummer, name, gehalt);
    }
}
