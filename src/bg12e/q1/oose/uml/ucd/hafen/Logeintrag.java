package bg12e.q1.oose.uml.ucd.hafen;

import java.time.LocalDate;
import java.time.LocalTime;

public class Logeintrag {
    private LocalDate datum;
    private LocalTime time;
    private String schiffname;
    private String bezeichnungSeestrasse;
    private int nrLiegeplatz;

    public Logeintrag(String s, String b) {
        this.datum = LocalDate.now();
        this.time = LocalTime.now();
        this.schiffname = s;
        this.bezeichnungSeestrasse = b;
        this.nrLiegeplatz = 0;
    }
}
