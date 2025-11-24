package bg12e.q1.oose.uml.sd.bibliothek;

import java.util.LinkedList;
import java.util.List;

public class Bibliothekssystem {
    public List<Buch> buecher;
    public List<Leser> leser;

    public Bibliothekssystem() {
        this.buecher = new LinkedList<>();
        this.leser = new LinkedList<>();
    }

    public Leser erfasseLeser(String name) {
        Leser leser = new Leser(name);
        this.leser.add(leser);
        return leser;
    }

    public void hinzufuegen(Buch buch) {
        this.buecher.add(buch);
    }

    public Leser sucheLeser(int leserNr) {
        for(Leser l : leser) {
            if(l.getLeserNr() == leserNr) {
                return l;
            }
        }
        return null;
    }

    public Buch sucheBuch(String titel) {
        for(Buch buch : buecher) {
            if(buch.getTitel().equals(titel)) {
                return buch;
            }
        }
        return null;
    }

    public Exemplar sucheFreiesExemplar(Buch buch) {
        if(buch == null) return null;
        for(Exemplar exemplar : buch.getExemplare()) {
            if(exemplar == null) return null;
            if(!exemplar.istAusgeliehen()) return exemplar;
        }
        return null;
    }

    public String sucheFreieInventarNr(Buch buch) {
        Exemplar exemplar = this.sucheFreiesExemplar(buch);
        if(exemplar == null) return "";
        return exemplar.getInventarNr();
    }

    public Exemplar sucheExemplar(String inventarNr) {
        for(Buch buch : buecher) {
            for(Exemplar exemplar : buch.getExemplare()) {
                if(exemplar.getInventarNr().equals(inventarNr)) return exemplar;
            }
        }
        return null;
    }

    public int ausleihen(int leserNr, String inventarNr) {
        Exemplar exemplar = this.sucheExemplar(inventarNr);
        if(exemplar == null) return 3;
        Leser leser = this.sucheLeser(leserNr);
        if(leser == null) return 3;
        return exemplar.ausleihen(leser);
    }

    public int zurueckgeben(String inventarNr) {
        Exemplar exemplar = this.sucheExemplar(inventarNr);
        return exemplar.zurueckgeben();
    }

    public String getLeserString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Anzahl an Leser: %s".formatted(this.leser.size())).append("\n");
        for(Leser leser : leser) {
            sb.append(leser.toString()).append("\n");
        }
        return sb.toString();
    }

    public String getBuecherString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Anzahl an Büchern: %s".formatted(this.buecher.size())).append("\n");
        for(Buch buch : buecher) {
            sb.append(buch.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bibliothekssystem;").append("\n");
        sb.append("max. Ausleihen pro Leser -> %s;\tAusleihdauer pro Buch: %s Tage".formatted(Leser.getMaxAusleihen(), Buch.getAusleihDauer())).append("\n\n");
        sb.append(getLeserString()).append("\n");
        sb.append(getBuecherString()).append("\n");
        return sb.toString();
    }
}
