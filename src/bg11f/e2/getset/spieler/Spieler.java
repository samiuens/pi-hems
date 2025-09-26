package bg11f.e2.getset.spieler;

public class Spieler {
    private String name;
    private String gegenstand;
    private int leben;

    public Spieler(String name, String gegenstand) {
        this.name = name;
        this.gegenstand = gegenstand;
        this.leben = 100;
    }

    public Spieler(String name) {
        this.name = name;
        this.gegenstand = "";
        this.leben = 100;
    }

    // Get-Set: Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Get-Set: Gegenstand
    public String getGegenstand() {
        return gegenstand;
    }
    public void setGegenstand(String gegenstand) {
        this.gegenstand = gegenstand;
    }

    // Get-Set: Leben
    public int getLeben() {
        return leben;
    }
    public void setLeben(int leben) {
        this.leben = leben;
    }

    public String toString() {
        return "Spieler: %s (%s/100HP)\nInventar: %s".formatted(name, leben, gegenstand);
    }
}
