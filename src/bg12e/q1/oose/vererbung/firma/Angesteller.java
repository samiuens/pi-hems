package bg12e.q1.oose.vererbung.firma;

public class Angesteller extends Person {
    private boolean istAussendienst;
    private int kuendigungsfrist;

    public Angesteller(String n, String g, int m, boolean istAussendienst, int k) {
        super(n, g, m);
        this.istAussendienst = istAussendienst;
        this.kuendigungsfrist = k;
    }

    public boolean isIstAussendienst() {
        return istAussendienst;
    }

    public void setIstAussendienst(boolean istAussendienst) {
        this.istAussendienst = istAussendienst;
    }

    public int getKuendigungsfrist() {
        return kuendigungsfrist;
    }

    public void setKuendigungsfrist(int kuendigungsfrist) {
        this.kuendigungsfrist = kuendigungsfrist;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String isAussendienst = this.istAussendienst ? "Außendienst" : "Innendienst";
        sb.append(toString(this.getClass().getSimpleName())).append(" | im %s | Kündigungsfrist: %s Monat(e)".formatted(isAussendienst, this.kuendigungsfrist));
        return sb.toString();
    }
}
