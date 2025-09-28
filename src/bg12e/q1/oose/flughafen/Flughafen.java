package bg12e.q1.oose.flughafen;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Flughafen {
    private String name;

    private Parkposition[] parkpositionen;
    private LinkedList<Flugzeug> flugzeuge;
    private Landebahn[] landebahnen;

    public Flughafen(String name) {
        this.name = name;
        this.parkpositionen = new Parkposition[5];
        this.flugzeuge = new LinkedList<>();
        this.landebahnen = new Landebahn[6];
    }

    public boolean addParkposition(Parkposition p) {
        for(int i = 0; i < parkpositionen.length; i++) {
            if(parkpositionen[i] == null) {
                parkpositionen[i] = p;
                return true;
            }
        }
        return false;
    }

    public boolean anmelden(Flugzeug f) {
        f.setStatus("WARTEND");
        flugzeuge.add(f);
        return true;
    }

    public boolean addLandebahn(Landebahn lb) {
        for(int i = 0; i < landebahnen.length; i++) {
            if(landebahnen[i] == null) {
                landebahnen[i] = lb;
                return true;
            }
        }
        return false;
    }

    public Flugzeug sucheFlugzeug(String fnr) {
        for(Flugzeug flugzeug : flugzeuge) {
            if(flugzeug.getFlugnummer().equals(fnr)) return flugzeug;
        }
        return null;
    }

    public List<Landebahn> sucheFreieBahnen() {
        List<Landebahn> freieBahnen = new LinkedList<>();
        for (Landebahn lb : landebahnen) {
            if (lb != null && lb.istFrei()) {
                freieBahnen.add(lb);
            }
        }
        return freieBahnen;
    }

    public int zuweisenLandebahn(String fnr) {
        Flugzeug searchFlugzeug = null;
        for(Flugzeug flugzeug : flugzeuge) {
            if(flugzeug.getFlugnummer().equals(fnr)) {
                searchFlugzeug = flugzeug;
            }
        }
        if(searchFlugzeug != null) {
            List<Landebahn> freieBahnen = sucheFreieBahnen();
            if(freieBahnen.isEmpty()) {
                searchFlugzeug.setStatus("WARTESCHLEIFE");
                return 0;
            }
            searchFlugzeug.setStatus("LANDEANFLUG");
            Landebahn freieBahn = freieBahnen.getFirst();
            freieBahn.belegen(searchFlugzeug);
            searchFlugzeug.setLandebahn(freieBahn);
            return 1;
        }
        return 0;
    }

    public boolean freigebenLandebahn(Landebahn b) {
        if(b.getFlugzeug() != null) return b.freigeben(b.getFlugzeug());
        return false;
    }

    public void entfernen(String flugnummer) {
        for(Flugzeug flugzeug : flugzeuge) {
            if(flugzeug.getFlugnummer().equals(flugnummer)) flugzeuge.remove(flugzeug);
        }
    }

    public int zuweisenParkposition(Flugzeug f) {
        if (flugzeuge.contains(f) && f.getStatus().equals("LANDEANFLUG")) {
            for (Parkposition parkPos : parkpositionen) {
                if (parkPos.getFlugzeug() == null) {
                    if (f.isIstFrachtflugzeug() && !parkPos.isHatFrachtentladung()) continue;
                    if (!f.isIstFrachtflugzeug() && parkPos.isHatFrachtentladung()) continue;

                    f.setParkpos(parkPos);
                    parkPos.belegen(f);
                    f.setStatus("GELANDET");
                    return 0;
                }
            }
        }
        return 1;
    }

    public Parkposition[] getParkpositionen() {
        return parkpositionen;
    }

    public LinkedList<Flugzeug> getFlugzeuge() {
        return flugzeuge;
    }

    public Landebahn[] getLandebahnen() {
        return landebahnen;
    }
}
