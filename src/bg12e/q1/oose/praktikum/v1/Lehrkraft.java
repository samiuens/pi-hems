package bg12e.q1.oose.praktikum.v1;

public class Lehrkraft {
    private String name;
    private String fachbereich;
    private boolean istProfessor;

    public Lehrkraft(String n, String f, boolean i) {
        this.name = n;
        this.fachbereich = f;
        this.istProfessor = i;
    }

    @Override
    public String toString() {
        return "%s (Professor: %s) -> Fachbereich: %s".formatted(this.name, this.istProfessor, this.fachbereich);
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
