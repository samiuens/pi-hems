package bg12e.q1.oose.vererbung.firma;

public class Fuehrungskraft extends Person {
    private double bonus;

    public Fuehrungskraft(String name, String gebDatum, int monatsgehalt, double bonus) {
        super(name, gebDatum, monatsgehalt);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toString(this.getClass().getSimpleName())).append(" | Bonus: %s".formatted(this.bonus));
        return sb.toString();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
