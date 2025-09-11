package bg12e.q1.oose.evl;

public class Kunde {
    private String name;
    private boolean istVIP;
    private double umsatz;

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
        return this.name;
    }

    public double getUmsatz() {
        return this.umsatz;
    }

    public boolean isIstVIP() {
        return this.istVIP;
    }

    public void setIstVIP(boolean istVIP) {
        this.istVIP = istVIP;
    }

    @Override
    public String toString() {
        String isVIP = this.istVIP ? " (VIP)" : "";
        String umsatz = this.umsatz == 0 ? "/" : Double.toString(this.umsatz);
        return "%s%s (Umsatz: %s)".formatted(this.name, isVIP, umsatz);
    }
}
