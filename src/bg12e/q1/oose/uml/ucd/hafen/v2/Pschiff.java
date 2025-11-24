package bg12e.q1.oose.uml.ucd.hafen.v2;

public class Pschiff extends Schiff {
    private int anzPassagiere;

    public Pschiff(String id, String n, int aP) {
        super(id, n);
        this.anzPassagiere = aP;
    }

    public int getAnzPassagiere() {
        return anzPassagiere;
    }

    public void setAnzPassagiere(int anzPassagiere) {
        this.anzPassagiere = anzPassagiere;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" | Anzahl der Passagiere: %s".formatted(this.anzPassagiere));
        return sb.toString();
    }
}
