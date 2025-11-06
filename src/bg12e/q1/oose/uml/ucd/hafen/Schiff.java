package bg12e.q1.oose.uml.ucd.hafen;

public class Schiff {
    private String id;
    private String name;
    private int ladung;
    private String status;
    private Liegeplatz liegeplatz;
    private Seestrasse seestrasse;

    public Schiff(String id, String n, int l) {
        this.id = id;
        this.name = n;
        this.ladung = l;
        this.status = "AUFGENOMMEN";
    }

    public void zuweisen(Seestrasse s) {

    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public Liegeplatz getLiegeplatz() {
        return liegeplatz;
    }

    public Seestrasse getSeestrasse() {
        return seestrasse;
    }
}
