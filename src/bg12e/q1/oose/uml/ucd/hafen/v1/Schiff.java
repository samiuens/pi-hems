package bg12e.q1.oose.uml.ucd.hafen.v1;

public class Schiff {
    private final String id;
    private String name;
    private int ladung;
    private SCHIFF_STATUS status;
    private Liegeplatz liegeplatz;
    private Seestrasse seestrasse;

    public enum SCHIFF_STATUS {
        UNBEKANNT,
        AUFGENOMMEN,
        EINFAHRT,
        ANKERN,
        WARTEND,
        ZUGEWIESEN,
        ANGELEGT
    }

    public Schiff(String id, String n, int l) {
        this.id = id;
        this.name = n;
        this.ladung = l;
        this.status = SCHIFF_STATUS.UNBEKANNT;
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

    public void setLadung(int ladung) {
        this.ladung = ladung;
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

    public int getLadung() {
        return ladung;
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
        sb.append("%s (%s; Status: %s) -> Ladung: %s".formatted(this.name, this.id, this.status.toString(), HafenUI.mapLadungToString(this.ladung)));
        if(this.seestrasse != null) {
            sb.append(" | Seestraße: %s".formatted(this.seestrasse.getBezeichnung()));
            }
        if(this.liegeplatz != null) {
            sb.append(" | Liegeplatz-Nummer: %s".formatted(this.liegeplatz.getNummer()));
        }
        return sb.toString();
    }
}
