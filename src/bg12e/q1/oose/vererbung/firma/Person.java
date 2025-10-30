package bg12e.q1.oose.vererbung.firma;

public class Person {
    protected String name;
    protected String gebDatum;
    protected int monatsgehalt;
    protected static int zaehler = 1000;
    protected int personalnummer;

    public Person(String name, String gebDatum, int monatsgehalt) {
        this.name = name;
        this.gebDatum = gebDatum;
        this.monatsgehalt = monatsgehalt;
        this.personalnummer = zaehler;
        zaehler++;
    }

    public String toString(String className) {
        StringBuilder sb = new StringBuilder();
        sb.append("(%s) %s -> \"%s\" (geb. am: %s) | %s Euro/Monat".formatted(this.personalnummer, className, this.name, this.gebDatum, this.monatsgehalt));
        return sb.toString();
    }

    public int berechneJahresgehalt() {
        return monatsgehalt * 12;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(String gebDatum) {
        this.gebDatum = gebDatum;
    }

    public int getMonatsgehalt() {
        return monatsgehalt;
    }

    public void setMonatsgehalt(int monatsgehalt) {
        this.monatsgehalt = monatsgehalt;
    }

    public static int getZaehler() {
        return zaehler;
    }

    public static void setZaehler(int zaehler) {
        Person.zaehler = zaehler;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }
}
