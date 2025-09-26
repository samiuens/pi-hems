package bg11f.e1.daten;

import java.util.Arrays;
import java.util.Scanner;

public class Ravioli {
    public Ravioli(String dose, double u, double h) {
        double pi = Math.PI;
        double d = u / pi;
        double g = (u * u) / 4 * pi;
        double m = u * h;
        double o = (2 * g) + m;
        double v = g * h;

        System.out.println("Durchmesser: " + d);
        System.out.println("Fläche: " + g);
        System.out.println("Mantelfläche: " + m);
        System.out.println("Gesamtfläche: " + o);
        System.out.println("Volumen: " + v);
        System.out.println("");
        System.out.println("Dose: " + dose);
    }

    public static void main(String[] args) {
        double u, h;
        String[] doseStrings = {"Penne-al-Olio", "Spagetti Family", "Tortellini Diavolo", "bg11f.daten.Ravioli \'fit for Kids\'"};
        int doseIndex;
        String dose;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welche Art von Dose möchten sie produzieren?: ");
        System.out.println(Arrays.toString(doseStrings));
        doseIndex = scan.nextInt();
        dose = doseStrings[doseIndex - 1];

        System.out.print("Umfang [u] (= Umfang des Dosenbodens): ");
        u = scan.nextDouble();
        System.out.print("Höhe [h] (= Höhe der Dose): ");
        h = scan.nextDouble();

        scan.close();
        new Ravioli(dose, u, h);
    }
}
