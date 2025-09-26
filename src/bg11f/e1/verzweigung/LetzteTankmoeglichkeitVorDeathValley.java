package bg11f.e1.verzweigung;

import java.util.Scanner;

public class LetzteTankmoeglichkeitVorDeathValley {
    public LetzteTankmoeglichkeitVorDeathValley() {
        double kapazität, verbrauch;
        int benzinanzeige;

        Scanner sc = new Scanner(System.in);
        System.out.print("Tankkapazität (Gallonen): ");
        kapazität = sc.nextDouble();
        System.out.print("Benzinanzeige (in Prozent): ");
        benzinanzeige = sc.nextInt();
        System.out.print("Benzinverbrauch (Meilen pro Gallone): ");
        verbrauch = sc.nextDouble();
        sc.close();

        double aktuellerTankinhalt = kapazität * (benzinanzeige / 100.0);
        double reichweite = aktuellerTankinhalt / verbrauch * 100;
        if (reichweite >= 200) {
            System.out.println("Weiterfahren.");
        } else {
            System.out.println("Tanken.");
        }
    }

    public static void main(String[] args) {
        new LetzteTankmoeglichkeitVorDeathValley();
    }
}
