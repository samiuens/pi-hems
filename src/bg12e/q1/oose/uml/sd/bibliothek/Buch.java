package bg12e.q1.oose.uml.sd.bibliothek;

import java.util.LinkedList;
import java.util.List;

public class Buch {
    private String isbn;
    private String titel;
    private static int ausleihDauer = 14;
    private List<Exemplar> exemplare;

    public Buch(String isbn, String titel) {
        this.isbn = isbn;
        this.titel = titel;
        this.exemplare = new LinkedList<>();
    }

    public void hinzufuegen(Exemplar e) {
        this.exemplare.add(e);
    }

    public void entfernen(Exemplar e) {
        this.exemplare.remove(e);
    }

    public boolean istVerfuegbar() {
        boolean freiesExemplar = false;
        for(Exemplar exemplar : exemplare) {
            if(exemplar.istAusgeliehen()) {
                freiesExemplar = true;
                break;
            }
        }
        return freiesExemplar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"%s\" (%s) -> Exemplarbestand: %s".formatted(this.titel, this.isbn, this.exemplare.size())).append("\n");
        for(Exemplar exemplar : exemplare) {
            sb.append("\t").append("-> " + exemplar.toString()).append("\n");
        }
        return sb.toString();
    }

    // Getter- und Setter-Methoden
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    // Static
    public static int getAusleihDauer() {
        return ausleihDauer;
    }

    public static void setAusleihDauer(int ausleihDauer) {
        Buch.ausleihDauer = ausleihDauer;
    }

    public List<Exemplar> getExemplare() {
        return exemplare;
    }
}
