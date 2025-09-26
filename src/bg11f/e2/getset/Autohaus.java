package bg11f.e2.getset;

import java.awt.*;

public class Autohaus {
    public class Auto {
        enum AUTO_MARKEN {
                MERCEDES, BMW
        }

        AUTO_MARKEN marke;
        String modell;
        Color farbe;
        int geschwindigkeit;

        public Auto(AUTO_MARKEN marke, String modell, Color farbe) {
            this.marke = marke;
            this.modell = modell;
            this.farbe = farbe;
            this.geschwindigkeit = 0;
        }
    }

    public Autohaus() {
        Auto[] fuhrpark = {
            new Auto(Auto.AUTO_MARKEN.BMW, "M5 F90", Color.BLACK)
        };

    }

    public static void main(String[] args) {
        new Autohaus();
    }
}
