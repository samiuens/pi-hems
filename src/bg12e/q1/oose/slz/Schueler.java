package bg12e.q1.oose.slz;

public class Schueler {
    private int ausweisNr;
    private String nachname;
    private String vorname;

    public Schueler(int nr, String nn, String vn) {
        this.ausweisNr = nr;
        this.nachname = nn;
        this.vorname = vn;
    }

    // Getter- und Settermethoden
    public int getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(int ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}
