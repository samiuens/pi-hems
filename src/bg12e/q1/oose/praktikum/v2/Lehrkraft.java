package bg12e.q1.oose.praktikum.v2;

public class Lehrkraft {
    private int personalnummer;
    private static int autowert = 10000;
    private String name;
    private String fachbereich;
    private boolean istProfessor;

    public Lehrkraft(String n, String f, boolean i) {
        this.personalnummer = autowert;
        autowert++;
        this.name = n;
        this.fachbereich = f;
        this.istProfessor = i;
    }

    @Override
    public String toString() {
        return "(%s) %s (Professor: %s) -> Fachbereich: %s".formatted(this.personalnummer, this.name, this.istProfessor, this.fachbereich);
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFachbereich() {
        return fachbereich;
    }

    public void setFachbereich(String fachbereich) {
        this.fachbereich = fachbereich;
    }

    public boolean isIstProfessor() {
        return istProfessor;
    }

    public void setIstProfessor(boolean istProfessor) {
        this.istProfessor = istProfessor;
    }
}
