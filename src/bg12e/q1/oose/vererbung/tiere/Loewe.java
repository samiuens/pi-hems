package bg12e.q1.oose.vererbung.tiere;

public class Loewe extends Tier {
    public Loewe(String n, boolean i) {
        super(n, i);
    }

    @Override
    protected String macheGeraeusch() {
        return "Rawrrrrrrrrrrrrrrr";
    }
}
