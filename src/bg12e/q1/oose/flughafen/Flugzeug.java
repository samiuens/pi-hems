package bg12e.q1.oose.flughafen;

import java.util.LinkedList;

public class Flugzeug {
    private String flugnummer;
    private String status;
    private boolean istFrachtflugzeug;
    private Landebahn landebahn;
    private Parkposition parkpos;

    public Flugzeug(String flugnummer, boolean istFrachtflugzeug) {
        this.flugnummer = flugnummer;
        this.status = null;
        this.istFrachtflugzeug = istFrachtflugzeug;
    }

    public void zuweisen(Landebahn lb) {
        this.landebahn = lb;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public boolean isIstFrachtflugzeug() {
        return istFrachtflugzeug;
    }

    public Parkposition getParkpos() {
        return parkpos;
    }

    public void setParkpos(Parkposition parkpos) {
        this.parkpos = parkpos;
    }

    public Landebahn getLandebahn() {
        return landebahn;
    }

    public void setLandebahn(Landebahn landebahn) {
        this.landebahn = landebahn;
    }

    @Override
    public String toString() {
        String landebahn = this.landebahn == null ? "null" : this.landebahn.getBezeichnung();
        String parkPos = this.parkpos == null ? "null" : String.valueOf(this.parkpos.getNummer());

        return "Flug %s (Status: %s, Fracht: %s) -> Landebahn: %s; Parkposition: %s".formatted(this.flugnummer, this.status, this.istFrachtflugzeug, landebahn, parkPos);
    }
}
