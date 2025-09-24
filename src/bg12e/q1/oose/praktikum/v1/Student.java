package bg12e.q1.oose.praktikum.v1;

import java.util.LinkedList;

public class Student {
    private String name;
    private double durchschnitt;
    private int semester;
    private LinkedList<Praktikum> praktika;

    public Student(String n, double d, int s) {
        this.matrikelnummer = autowert;
        autowert++;
        this.name = n;
        this.durchschnitt = d;
        this.semester = s;
        this.praktika = new LinkedList<>();
    }

    public String toStringPraktika() {
        if(praktika.isEmpty()) return "keine Praktika";
        StringBuilder sb = new StringBuilder();
        for(Praktikum praktika : praktika) {
            sb.append(sb).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("%s (%s, Semester: %s) -> ".formatted(this.name, this.durchschnitt, this.semester));

        for(int i = 0; i < praktika.size(); i++) {
            sb.append(praktika.get(i).getBezeichnung());
            if(i < praktika.size() - 1) {
                sb.append(", ");
            }
        }

        if(praktika.isEmpty()) sb.append("keine Praktika!");
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDurchschnitt() {
        return durchschnitt;
    }

    public void setDurchschnitt(double durchschnitt) {
        this.durchschnitt = durchschnitt;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public boolean addPraktika(Praktikum p) {
        return this.praktika.add(p);
    }

    public boolean removePraktika(Praktikum p) {
        return this.praktika.remove(p);
    }
}
