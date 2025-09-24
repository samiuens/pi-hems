package bg12e.q1.oose.autohaus;

import java.util.LinkedList;

public class Autohaus {
    private String name;
    private LinkedList<Auto> autos;

    public Autohaus(String n) {
        this.name = n;
        this.autos = new LinkedList<>();
    }

    public boolean hinzufuegen(Auto a) {
        return this.autos.add(a);
    }

    public boolean entfernen(Auto a) {
        return this.autos.remove(a);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String kopfzeile = "Autohaus: %s".formatted(this.name);
        sb.append(kopfzeile).append("\n");
        for (Auto a : autos) {
            sb.append(a).append("\n");
        }
        return sb.toString();
    }
}
