package bg12e.q1.oose.uml.ucd.hafen.v1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Logeintrag {
    private LocalDate datum;
    private LocalTime time;
    private String schiffname;
    private String bezeichnungSeestrasse;
    private int nrLiegeplatz;

    public Logeintrag(String s, String b, int l) {
        this.datum = LocalDate.now();
        this.time = LocalTime.now();
        this.schiffname = s;
        this.bezeichnungSeestrasse = b;
        this.nrLiegeplatz = l;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getSchiffname() {
        return schiffname;
    }

    public void setSchiffname(String schiffname) {
        this.schiffname = schiffname;
    }

    public String getBezeichnungSeestrasse() {
        return bezeichnungSeestrasse;
    }

    public void setBezeichnungSeestrasse(String bezeichnungSeestrasse) {
        this.bezeichnungSeestrasse = bezeichnungSeestrasse;
    }

    public int getNrLiegeplatz() {
        return nrLiegeplatz;
    }

    public void setNrLiegeplatz(int nrLiegeplatz) {
        this.nrLiegeplatz = nrLiegeplatz;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("%s @ %s – %s -> Seestrasse: %s; Liegeplatz: %s".formatted(this.datum, formatTime(this.time), this.schiffname, this.bezeichnungSeestrasse, this.nrLiegeplatz));
        return sb.toString();
    }

    private String formatTime(LocalTime time) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(dtf);
    }
}
