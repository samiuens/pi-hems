package bg12e.q1.oose.uml.ucd.hafen.v2;

abstract public class Schiff {
    protected final String id;
    protected String name;
    protected SCHIFF_STATUS status;
    protected Liegeplatz liegeplatz;
    protected Seestrasse seestrasse;

    public enum SCHIFF_STATUS {
        UNBEKANNT,
        AUFGENOMMEN,
        EINFAHRT,
        ANKERN,
        WARTEND,
        ZUGEWIESEN,
        ANGELEGT
    }

    public Schiff(String id, String n) {
        this.id = id;
        this.name = n;
        this.status = SCHIFF_STATUS.UNBEKANNT;
        this.liegeplatz = null;
        this.seestrasse = null;
    }

    public void zuweisen(Seestrasse s) {
        this.seestrasse = s;
    }

    public void setStatus(SCHIFF_STATUS status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLiegeplatz(Liegeplatz liegeplatz) {
        this.liegeplatz = liegeplatz;
    }

    public void setSeestrasse(Seestrasse seestrasse) {
        this.seestrasse = seestrasse;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SCHIFF_STATUS getStatus() {
        return status;
    }

    public Liegeplatz getLiegeplatz() {
        return liegeplatz;
    }

    public Seestrasse getSeestrasse() {
        return seestrasse;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("%s (%s; Status: %s)".formatted(this.name, this.id, this.status.toString()));
        if(this.seestrasse != null) {
            sb.append(" | Seestraße: %s".formatted(this.seestrasse.getBezeichnung()));
        }
        if(this.liegeplatz != null) {
            sb.append(" | Liegeplatz-Nummer: %s".formatted(this.liegeplatz.getNummer()));
        }
        return sb.toString();
    }
}
