package bg12e.q1.oose.uml.ucd.hafen.v2;

public class Fschiff extends Schiff {
    private int ladung;

    public Fschiff(String id, String n, int l) {
        super(id, n);
        this.ladung = l;
    }

    public int getLadung() {
        return ladung;
    }

    public void setLadung(int ladung) {
        this.ladung = ladung;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" | Ladung: %s".formatted(HafenUI.mapLadungToString(this.ladung)));
        return sb.toString();
    }
}
