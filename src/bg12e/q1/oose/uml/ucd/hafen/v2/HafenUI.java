package bg12e.q1.oose.uml.ucd.hafen.v2;

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

        Schiff fs1 = new Fschiff("123", "Test 1", mapLadungToInt(FRACHTLADUNGEN.CONTAINER));
        hls.hinzufuegen(fs1);
        hls.anmelden(fs1);

        Schiff ps1 = new Pschiff("321", "Test 2", 250);
        hls.hinzufuegen(ps1);
        hls.anmelden(ps1);

        Seestrasse ss1 = new Seestrasse("Seestraße 1");
        hls.hinzufuegen(ss1);

        Seestrasse ss2 = new Seestrasse("Seestraße 2");
        hls.hinzufuegen(ss2);

        hls.zuweisenSeestrasse(fs1.getName());
        hls.zuweisenSeestrasse(ps1.getName());

        Liegeplatz lp1 = new Liegeplatz(500, mapLadungToInt(FRACHTLADUNGEN.FLUESSIGLADUNG));
        Liegeplatz lp2 = new Liegeplatz(200, mapLadungToInt(FRACHTLADUNGEN.FAHRZEUGE));
        Liegeplatz lp3 = new Liegeplatz(100, mapLadungToInt(FRACHTLADUNGEN.CONTAINER));
        hls.hinzufuegen(lp1);
        hls.hinzufuegen(lp2);
        //hls.hinzufuegen(lp3);


        System.out.println(hls.getLogs());
        System.out.println("_______________________");
        System.out.println(fs1);
        System.out.println(ps1);
    }

    public static void main(String[] args) {
        new HafenUI();
    }
}
