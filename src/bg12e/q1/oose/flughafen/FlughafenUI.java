package bg12e.q1.oose.flughafen;

import java.util.Arrays;

public class FlughafenUI {
    public static void main(String[] args) {
        // Erstelle Flughafen
        Flughafen fh = new Flughafen("Frankfurt am Main");

        // Erstelle Flugzeuge; melde sie an
        Flugzeug f1 = new Flugzeug("LH111", false);
        Flugzeug f2 = new Flugzeug("THY666", true);
        Flugzeug f3 = new Flugzeug("QA222", false);
        fh.anmelden(f1);
        fh.anmelden(f2);
        fh.anmelden(f3);

        // Erstelle Landebahnen; füge sie hinzu
        Landebahn l1 = new Landebahn("09R");
        Landebahn l2 = new Landebahn("25C");
        Landebahn l3 = new Landebahn("17R");
        fh.addLandebahn(l1);
        fh.addLandebahn(l2);
        fh.addLandebahn(l3);

        // Erstelle Parkpositionen; füge sie hinzu
        Parkposition p1 = new Parkposition(1, 250, false, false);
        Parkposition p2 = new Parkposition(2, 350, false, true);
        Parkposition p3 = new Parkposition(3, 50, false, true);
        fh.addParkposition(p1);
        fh.addParkposition(p2);
        fh.addParkposition(p3);

        // Weise 2/3 Flugzeugen, eine Landebahn hinzu
        fh.zuweisenLandebahn(f1.getFlugnummer());
        fh.zuweisenLandebahn(f2.getFlugnummer());

        // Weise Flugzeug 2, eine Parkposition zu
        fh.zuweisenParkposition(f2);

        printAll(fh);

        // Gebe alle Landenbahn wieder frei
        fh.freigebenLandebahn(l1);
        fh.freigebenLandebahn(l2);
        fh.freigebenLandebahn(l3);
    }

    private static void printAll(Flughafen fh) {
        printAllFlugzeuge(fh);
        printAllLandebahnen(fh);
        printAllParkpositionen(fh);
    }

    private static void printAllFlugzeuge(Flughafen fh) {
        StringBuilder sb = new StringBuilder();
        for(Flugzeug flugzeug : fh.getFlugzeuge()) {
            sb.append(flugzeug).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void printAllLandebahnen(Flughafen fh) {
        StringBuilder sb = new StringBuilder();
        for(Landebahn landebahn : fh.getLandebahnen()) {
            if(landebahn != null) sb.append(landebahn).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void printAllParkpositionen(Flughafen fh) {
        StringBuilder sb = new StringBuilder();
        for(Parkposition parkPosition : fh.getParkpositionen()) {
            if(parkPosition != null) sb.append(parkPosition).append("\n");
        }
        System.out.println(sb.toString());
    }
}
