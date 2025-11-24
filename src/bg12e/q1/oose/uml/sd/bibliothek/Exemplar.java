package bg12e.q1.oose.uml.sd.bibliothek;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exemplar {
    private String inventarNr;
    private LocalDate ausleihDatum;
    private Buch buch;
    private Leser ausleiher;

    public Exemplar(String inventarNr, Buch buch) {
        this.inventarNr = inventarNr;
        this.ausleihDatum = LocalDate.now();
        this.buch = buch;
        this.ausleiher = null;
    }

    public boolean istAusgeliehen() {
        return ausleiher != null;
    }

    public LocalDate ermittleRueckgabedatum() {
        return ausleihDatum.plusDays(Buch.getAusleihDauer());
    }

    public int ausleihen(Leser leser) {
        if(istAusgeliehen()) {
            return 1;
        }
        if(leser.hatAusleihen() >= Leser.getMaxAusleihen()) {
            return 2;
        }
        leser.hinzufuegen(this);
        this.ausleiher = leser;
        return 0;
    }

    public int zurueckgeben() {
        if(!istAusgeliehen()) {
            return 2;
        }

        LocalDate dateNow = LocalDate.now();
        long daysBetween = ChronoUnit.DAYS.between(dateNow, ermittleRueckgabedatum());
        ausleiher.entfernen(this);
        if(daysBetween > 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"%s\" (Buch: %s) -> ".formatted(this.inventarNr, this.buch.getTitel()));
        if(this.istAusgeliehen()) {
            sb.append("ausgeliehen an %s; ausgeliehen am %s, Rückgabe am %s".formatted(this.ausleiher.getName(), this.ausleihDatum, this.formatDateToString(this.ermittleRueckgabedatum())));
        } else {
            sb.append("nicht ausgeliehen!");
        }
        return sb.toString();
    }

    private String formatDateToString(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        return date.format(formatter);
    }

    // Getter- und Setter-Methoden

    public String getInventarNr() {
        return inventarNr;
    }

    public void setInventarNr(String inventarNr) {
        this.inventarNr = inventarNr;
    }

    public LocalDate getAusleihDatum() {
        return ausleihDatum;
    }

    public void setAusleihDatum(LocalDate ausleihDatum) {
        this.ausleihDatum = ausleihDatum;
    }

    public Buch getBuch() {
        return buch;
    }

    public void setBuch(Buch buch) {
        this.buch = buch;
    }

    public Leser getAusleiher() {
        return ausleiher;
    }

    public void setAusleiher(Leser ausleiher) {
        this.ausleiher = ausleiher;
    }
}
