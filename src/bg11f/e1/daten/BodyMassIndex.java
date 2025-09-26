package bg11f.e1.daten;

import java.util.Scanner;

public class BodyMassIndex {
    public static double Formel(double gewicht, double groesse) {
        double bmi = gewicht / (groesse * groesse);
        return bmi;
    }

    public static String AuswertungBMI(double bmi) {
        if(bmi < 18.5 && bmi > 0.0) {
            return "Untergewicht";
        } else if(bmi >= 18.5 && bmi <= 24.9) {
            return "Normalgewicht";
        } else if(bmi >= 25.0 && bmi <= 29.9) {
            return "Übergewicht";
        } else if(bmi >= 30.0 && bmi <= 34.9) {
            return "Adipositas: 1. Grad";
        } else if(bmi >= 35.0 && bmi >= 39.9) {
            return "Adipositas: 2. Grad";
        }

        return "Fehler; Bitte überprüfe deine Eingaben!";
    }

    public BodyMassIndex() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viel wiegst du? (kg)");
        double gewicht = sc.nextDouble();
        System.out.println("Wie groß bist du? (m)");
        double groesse = sc.nextDouble();
        
        sc.close();
        double bmi = Formel(gewicht, groesse);
        System.out.println("Dein Body-Mass-Index beträgt: " + bmi);
        System.out.println();
        String auswertung = AuswertungBMI(bmi);
        System.out.println("Laut der BMI-Skale bist du: " + auswertung);
    }

    public static void main(String[] args) {
        new BodyMassIndex();
    }
}
