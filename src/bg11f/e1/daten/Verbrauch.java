package bg11f.e1.daten;

import java.util.Scanner;

public class Verbrauch {
    public Verbrauch(double strecke, double liter) {
        double dv = (liter / strecke) * 100;
        System.out.println("Der Durchschnittsverbrauch liegt bei: " + dv + " Litern auf 100km.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double strecke, liter;

        System.out.println("Geben sie die gefahrene Stecke ein: ");
        strecke = sc.nextDouble();

        System.out.println("Geben sie die verbrauchten Liter ein: ");
        liter = sc.nextDouble();
        sc.close();

        new Verbrauch(strecke, liter);
    }
}