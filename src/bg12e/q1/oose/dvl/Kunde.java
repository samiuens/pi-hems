package bg12e.q1.oose.dvl;

public class Kunde {
    private String name;
    private boolean istVIP;
    private double umsatz;

    public Kunde(String name) {
        this.name = name;
        this.istVIP = false;
        this.umsatz = 0;
    }

    public Kunde(String name, boolean istVIP) {
        this.name = name;
        this.istVIP = istVIP;
        this.umsatz = 0;
    }

    public void erhoeheUmsatz(double betrag) {
        if(betrag <= 0) return;
        this.umsatz += betrag;
    }

    public void verringereUmsatz(double betrag) {
        if(betrag <= 0) return;
        this.umsatz -= betrag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIstVIP() {
        return istVIP;
    }

    public void setIstVIP(boolean istVIP) {
        this.istVIP = istVIP;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }

    @Override
    public String toString() {
        return "\"%s\" (%s, Umsatz: %s)".formatted(this.name, this.istVIP, this.umsatz);
    }
}
