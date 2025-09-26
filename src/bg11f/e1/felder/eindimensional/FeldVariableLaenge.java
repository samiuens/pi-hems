package bg11f.e1.felder.eindimensional;

import java.util.Scanner;

public class FeldVariableLaenge {
    public FeldVariableLaenge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl, der Kommazahlen ein, die sie speichern möchten.");
        int size = sc.nextInt();
        System.out.println("Array mit dem Typ \"double\" und der Größe %s wird erstellt...\n".formatted(size));
        double[] feld = new double[size];
        
        double summe = 0;
        double lowestValue = 9999;
        double highestValue = -9999;
        for(int i = 0; i < feld.length; i++) {
            System.out.println("Geben Sie die %s. Zahl ein: ".formatted(i + 1));
            double input = sc.nextDouble();
            feld[i] = input;

            summe += feld[i];
            if(feld[i] < lowestValue) lowestValue = feld[i];
            if(feld[i] > highestValue) highestValue = feld[i];
        }
        double middleValue = summe / 2;
        sc.close();
        
        System.out.println();
        for(int s = 0; s < feld.length; s++) {
            System.out.print("%s. Wert\t-> %s ".formatted(s + 1, feld[s]));
            if(feld[s] == lowestValue) {
                System.out.print("(kleinster Wert)");
            } else if(feld[s] == highestValue) {
                System.out.print("(höchster Wert)");
            } else if(feld[s] == middleValue) {
                System.out.print("(Mittelwert!)");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        new FeldVariableLaenge();
    }
}
