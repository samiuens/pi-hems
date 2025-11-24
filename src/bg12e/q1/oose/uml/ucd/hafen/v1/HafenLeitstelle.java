package bg12e.q1.oose.uml.ucd.hafen.v1;

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

    public String anmelden(Schiff s) {
        for(Schiff schiff : schiffe) {
            if(schiff.equals(s)) s.setStatus(Schiff.SCHIFF_STATUS.AUFGENOMMEN);
            return s.getStatus().toString();
        }
        return null;
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

        for(Seestrasse ss : this.seestrassen) {
            if(ss != null && ss.istFrei()) {
                ss.belegen(schiff);
                schiff.zuweisen(ss);
                schiff.setStatus(Schiff.SCHIFF_STATUS.EINFAHRT);
                Logeintrag log = new Logeintrag(schiff.getName(), ss.getBezeichnung(), 0);
                hinzufuegen(log);
                return 0;
            }
        }
        return -1;
    }

    public void freigebenSeestrasse(Seestrasse ss) {
        if(ss != null && !ss.istFrei()) {
            Logeintrag log = new Logeintrag(ss.getSchiff().getName(), "null", 0);
            hinzufuegen(log);
            ss.getSchiff().setSeestrasse(null);
            ss.freigeben();
        }
    }

    public List<Schiff> sucheLadungSchiffe(int code) {
        List<Schiff> schiffe = new LinkedList<>();
        for(Schiff s : this.schiffe) {
            if(s.getLadung() == code) {
                schiffe.add(s);
            }
        }
        return schiffe;
    }

    public boolean hinzufuegen(Logeintrag le) {
        return this.logs.add(le);
    }

    public Logeintrag findeLogeintrag(int index) {
        return this.logs.get(index);
    }

    public void aktualisiereLogeintrag(String schiffname) {
        for(Logeintrag log : this.logs) {
            if(log.getSchiffname().equals(schiffname)) {
                log.setSchiffname(schiffname);
            }
        }
    }

    public boolean hinzufuegen(Schiff s) {
        return this.schiffe.add(s);
    }

    public boolean hinzufuegen(Seestrasse ss) {
        for(int i = 0; i < this.seestrassen.length; i++) {
            if(this.seestrassen[i] == null) {
                this.seestrassen[i] = ss;
                return true;
            }
        }
        return false;
    }

    public boolean hinzufuegen(Liegeplatz lp) {
        for(int i = 0; i < this.liegeplaetze.length; i++) {
            if(this.liegeplaetze[i] == null) {
                this.liegeplaetze[i] = lp;
                return true;
            }
        }
        return false;
    }

    public void entfernen(String schiffname) {
        Schiff schiff = this.sucheSchiff(schiffname);
        if(schiff == null) return;

        this.freigebenSeestrasse(schiff.getSeestrasse());
        this.schiffe.remove(schiff);
    }

    public boolean zuweisenLiegeplatz(Schiff s) {
        for(Liegeplatz lp : this.liegeplaetze) {
            if(lp.istFrei()) {
                if(!lp.getLadungsarten().contains(s.getLadung())) {
                    System.out.println("> Ladung für Liegeplatz %s stimmt nicht für Schiff überein!".formatted(lp.getNummer()));
                    break;
                }

                this.freigebenSeestrasse(s.getSeestrasse());
                lp.belegen(s);
                s.setLiegeplatz(lp);
                Logeintrag log = new Logeintrag(s.getName(), "null", lp.getNummer());
                hinzufuegen(log);
                return true;
            }
        }
        return false;
    }

    public void freigebenLiegeplatz(Liegeplatz lp) {
        if(lp != null && !lp.istFrei()) {
            Logeintrag log = new Logeintrag(lp.getSchiff().getName(), lp.getSchiff().getSeestrasse().getBezeichnung(), lp.getNummer());
            hinzufuegen(log);
            lp.getSchiff().setLiegeplatz(null);
            lp.freigeben();
        }
    }

    public String getLogs() {
        if(this.logs.isEmpty()) return "Keine Logs gefunden!";

        StringBuilder sb = new StringBuilder();
        for(Logeintrag log : this.logs) {
            sb.append(log.toString()).append("\n");
        }
        return sb.toString();
    }
}
