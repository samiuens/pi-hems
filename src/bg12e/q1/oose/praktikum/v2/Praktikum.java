package bg12e.q1.oose.praktikum.v2;

import java.util.LinkedList;

public class Praktikum {
    private String bezeichnung;
    private boolean istGestartet;
    private LinkedList<Student> studenten;
    private Lehrkraft[] lehrkraefte;

    private static final int MAX_ANZAHL_LEHRKRAEFTE = 3;

    public Praktikum(String b) {
        this.bezeichnung = b;
        this.studenten = new LinkedList<>();
        this.lehrkraefte = new Lehrkraft[MAX_ANZAHL_LEHRKRAEFTE];
    }

    public int hinzufuegen(Student s) {
        if(istGestartet) return -1;
        studenten.add(s);
        s.addPraktika(this);
        return studenten.size();
    }

    public boolean hinzufuegen(Lehrkraft l) {
        boolean lehrerAdded = false;
        for(int i = 0; i < lehrkraefte.length; i++) {
            if(lehrkraefte[i] == null) {
                lehrkraefte[i] = l;
                lehrerAdded = true;
                break;
            }
        }
        return lehrerAdded;
    }

    public Student entfernen(String n) {
        Student searchResult = sucheStudent(n);
        studenten.remove(searchResult);
        searchResult.removePraktika(this);
        return searchResult;
    }

    public Student sucheStudent(String name) {
        for(Student student : studenten) {
            if(student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public Student sucheStudent(int m) {
        for(Student student : studenten) {
            if(student.getMatrikelnummer() == m) {
                return student;
            }
        }
        return null;
    }

    public Lehrkraft sucheLehrkraft(int p) {
        for(Lehrkraft lehrkraft : lehrkraefte) {
            if(lehrkraft.getPersonalnummer() == p) {
                return lehrkraft;
            }
        }
        return null;
    }

    public double ermittleDurchschnittsnote() {
        if(studenten.isEmpty()) return -1;
        double gesamt = 0;
        for(Student student : studenten) {
            gesamt += student.getDurchschnitt();
        }
        return gesamt / studenten.size();
    }

    public double ermittleDurchschnittssemster() {
        if(studenten.isEmpty()) return -1;
        double gesamt = 0;
        for(Student student : studenten) {
            gesamt += student.getSemester();
        }
        return gesamt / studenten.size();
    }

    public boolean start() {
        if(studenten.isEmpty() || lehrkraefte.length != MAX_ANZAHL_LEHRKRAEFTE) return false;
        boolean professorGefunden = false;
        for (Lehrkraft lehrkraft : lehrkraefte) {
            if (lehrkraft.isIstProfessor()) {
                professorGefunden = true;
                break;
            }
        }
        if(!professorGefunden) return false;

        istGestartet = true;
        return true;
    }

    public String toStringStudentenListe() {
        if(studenten.isEmpty()) return "keine Studenten!\n\n";
        StringBuilder sb = new StringBuilder();
        for(Student student : studenten) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }

    public String toStringLehrkraefte() {
        boolean arrayLeer = true;
        for(Lehrkraft lehrkraft : lehrkraefte) {
            if (lehrkraft != null) {
                arrayLeer = false;
                break;
            }
        }

        if(arrayLeer) return "keine Lehrkräfte!\n\n";
        StringBuilder sb = new StringBuilder();
        for(Lehrkraft lehrkraft : lehrkraefte) {
            sb.append(lehrkraft).append("\n");
        }
        return sb.toString();
    }

    public String filter(double d, int s) {
        if(studenten.isEmpty()) return "Keine Teilnehmer im Praktikum";
        LinkedList<Student> filteredStudents = new LinkedList<>();
        for(Student student : studenten) {
            if(student.getDurchschnitt() <= d && student.getSemester() >= s) {
                filteredStudents.add(student);
            }
        }
        if(filteredStudents.isEmpty()) return "Keine Studenten fuer die Filtereinstellung gefunden.";

        StringBuilder sb = new StringBuilder();
        for(Student filteredStudent : filteredStudents) {
            sb.append(filteredStudent).append("\n");
        }
        return sb.toString();
    }

    public String sortieren() {
        if(studenten.isEmpty()) return "Keine Teilnehmer im Praktikum";
        LinkedList<Student> klon = new LinkedList<>();
        LinkedList<Student> ergebnis = new LinkedList<>();

        for (Student student : studenten) {
            klon.add(student);
        }

        while(!klon.isEmpty()) {
            Student min = klon.getFirst();
            for(int i = 0; i < klon.size(); i++) {
                Student aktueller = klon.get(i);
                if(aktueller.getSemester() < min.getSemester()) {
                    min = aktueller;
                }
            }
            klon.remove(min);
            ergebnis.add(min);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ergebnis.size(); i++) {
            Student aktueller = ergebnis.get(i);
            String formattedString = "%s (%s, %s)".formatted(aktueller.getName(), aktueller.getDurchschnitt(), aktueller.getSemester());
            sb.append(i + 1).append(".: ").append(formattedString).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String kopfzeile = "Praktikum \"%s\" (%s)".formatted(this.bezeichnung, this.istGestartet);
        sb.append(kopfzeile).append("\n\n");
        sb.append(toStringLehrkraefte()).append("\n");
        sb.append(toStringStudentenListe());
        return sb.toString();
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public boolean isIstGestartet() {
        return istGestartet;
    }

    public void setIstGestartet(boolean istGestartet) {
        this.istGestartet = istGestartet;
    }

    public LinkedList<Student> getStudenten() {
        return studenten;
    }

    /*public void setStudenten(LinkedList<Student> studenten) {
        this.studenten = studenten;
    }*/

    public Lehrkraft[] getLehrkraefte() {
        return lehrkraefte;
    }

    /*public void setLehrkraefte(Lehrkraft[] lehrkraefte) {
        this.lehrkraefte = lehrkraefte;
    }*/
}
