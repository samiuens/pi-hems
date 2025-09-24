package bg12e.q1.oose.evl;

import java.util.Random;

public class EvlUI {
    public static void main(String[] args) {
        Firma f1 = new Firma("Test");

        KundenlisteEVL liste = new KundenlisteEVL();
        for(int i = 0; i < 10; i++) {
            Kunde k = new Kunde("Test %s".formatted(i + 1), false);
            k.erhoeheUmsatz(getRandomUmsatz());
            liste.hinzufuegen(k);
        }
        f1.setKundenliste(liste);
        f1.aktualisiereVL();
        f1.aktualisierePL();

        System.out.println(liste);
        System.out.println(f1.toStringVL());
        System.out.println(f1.toStringPL());
        System.out.println(f1.toString());
    }

    public static double getRandomUmsatz() {
        Random rndm = new Random();
        return (double) Math.round(rndm.nextFloat(1000) * 100) / 100;
    }
}
