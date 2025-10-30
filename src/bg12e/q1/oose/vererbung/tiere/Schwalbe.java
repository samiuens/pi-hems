package bg12e.q1.oose.vererbung.tiere;

public class Schwalbe extends Tier {

    public Schwalbe(String n, boolean i) {
        super(n, i);
    }

    @Override
    protected String macheGeraeusch() {
        return "GuruGuru";
    }
}
