package bg12e.q1.oose.uml.ucd.hafen;

import java.util.Objects;

public class HafenUI {
    private final HafenLeitstelle hls;

    public enum FRACHTLADUNGEN {
        CONTAINER,
        FLUESSIGLADUNG,
        SAUGGUT,
        FAHRZEUGE,
    };

    public static int mapLadungToInt(FRACHTLADUNGEN ladung) {
        return switch (ladung) {
            case CONTAINER -> 1;
            case FLUESSIGLADUNG -> 2;
            case SAUGGUT -> 3;
            case FAHRZEUGE -> 4;
            default -> 0;
        };
    }

    public static String mapLadungToString(int ladung) {
        return switch(ladung) {
            case 1 -> "CONTAINER";
            case 2 -> "FLÜSSIGLADUNG";
            case 3 -> "SAUGGUT";
            case 4 -> "FAHRZEUGE";
            default -> "UNBEKANNT";
        };
    }

    public HafenUI() {
        this.hls = new HafenLeitstelle("Test");

        Schiff s1 = new Schiff("123", "Schiff 1", mapLadungToInt(FRACHTLADUNGEN.FAHRZEUGE));
        hls.hinzufuegen(s1);
        hls.anmelden(s1);

        Seestrasse ss1 = new Seestrasse("Seestraße 1");
        hls.hinzufuegen(ss1);
        hls.zuweisenSeestrasse(s1.getName());

        Liegeplatz lp1 = new Liegeplatz(500, mapLadungToInt(FRACHTLADUNGEN.FLUESSIGLADUNG));
        Liegeplatz lp2 = new Liegeplatz(200, mapLadungToInt(FRACHTLADUNGEN.FAHRZEUGE));
        hls.hinzufuegen(lp1);
        hls.hinzufuegen(lp2);

        hls.zuweisenSeestrasse(s1.getName());
        hls.zuweisenLiegeplatz(s1);

        System.out.println(hls.getLogs());
        System.out.println(s1);
    }

    public static void main(String[] args) {
        new HafenUI();
    }
}
