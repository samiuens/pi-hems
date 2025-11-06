package bg12e.q1.oose.uml.ucd.hafen;

import java.util.Objects;

public class HafenUI {
    private HafenLeitstelle hls;

    public enum FRACHTLADUNGEN {
        CONTAINER,
        FLUESSIGLADUNG,
        SAUGGUT,
        FAHRZEUGE,
    };

    public int mapLadungToInt(FRACHTLADUNGEN ladung) {
        return switch (ladung) {
            case CONTAINER -> 1;
            case FLUESSIGLADUNG -> 2;
            case SAUGGUT -> 3;
            case FAHRZEUGE -> 4;
            default -> 0;
        };
    }

    public HafenUI() {
        this.hls = new HafenLeitstelle("Test");
    }

    public static void main(String[] args) {
        new HafenUI();
    }
}
