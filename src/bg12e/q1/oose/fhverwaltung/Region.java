package bg12e.q1.oose.fhverwaltung;

import java.util.LinkedList;

public class Region {
    private String name;
    private String land;
    private LinkedList<Ferienhaus> objekte;

    public Region(String name, String land) {
        this.name = name;
        this.land = land;
        this.objekte = new LinkedList<>();
    }

    public void hinzufuegenObjekt(Ferienhaus fh) {
        objekte.add(fh);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public LinkedList<Ferienhaus> getObjekte() {
        return objekte;
    }

    public void setObjekte(LinkedList<Ferienhaus> objekte) {
        this.objekte = objekte;
    }
}
