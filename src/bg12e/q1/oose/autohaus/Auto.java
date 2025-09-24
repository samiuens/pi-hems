package bg12e.q1.oose.autohaus;

public class Auto {
    private static int FIN;
    private int fin;
    private String modell;
    private int kmStand;

    public Auto(String m, int km) {
        FIN++;
        this.fin = FIN;
        this.modell = m;
        this.kmStand = km;
    }

    @Override
    public String toString() {
        return "%s (FIN: %s) -> %s km".formatted(this.modell, this.fin, this.kmStand);
    }
}
