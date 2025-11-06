package bg12e.q1.oose.uml.ucd.hafen;

import java.util.LinkedList;
import java.util.List;

public class HafenLeitstelle {
    private String name;
    private Seestrasse[] seestrassen;
    private List<Logeintrag> logs;
    private Liegeplatz[] liegeplaetze;
    private List<Schiff> schiffe;

    public HafenLeitstelle(String name) {
        this.name = name;
        this.seestrassen = new Seestrasse[5];
        this.logs = new LinkedList<>();
        this.liegeplaetze = new Liegeplatz[20];
        this.schiffe = new LinkedList<>();
    }

    public void anmelden(Schiff s) {
        this.schiffe.add(s);
    }

    public Schiff sucheSchiff(String schiffname) {
        for(Schiff s : schiffe) {
            if(s.getName().equals(schiffname)) return s;
        }
        return null;
    }

    public int zuweisenSeestrasse(String schiffname) {
        Schiff schiff = this.sucheSchiff(schiffname);
        if(schiff == null) return 2;



        return -1;
    }

    public void freigebenSeestrasse(Seestrasse ss) {}

    public List<Schiff> sucheLadungSchiffe(int code) {
        return null;
    }

    public boolean hinzufuegen(Logeintrag le) {
        return this.logs.add(le);
    }

    public Logeintrag findeLogeintrag(int index) {
        return this.logs.get(index);
    }

    public void aktualisiereLogeintrag(String schiffname) {}

    public boolean hinzufuegen(Schiff s) {
        return false;
    }

    public void entfernen(String schiffname) {}

    public boolean zuweisenLiegeplatz(Schiff s) {
        return false;
    }
}
