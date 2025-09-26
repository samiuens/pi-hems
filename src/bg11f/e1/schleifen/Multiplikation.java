package bg11f.e1.schleifen;

import java.util.Scanner;

public class Multiplikation {
    public Multiplikation() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben sie die erste Zahl ein: ");
        int zahl1 = sc.nextInt();
        System.out.println("\nGeben sie die zweite Zahl ein: ");
        int zahl2 = sc.nextInt();
        sc.close();
        
        int i = 0, ergebnis = 0;
        while(zahl1 > i || zahl1 < i) {
            i++;
            ergebnis += zahl2;
        }
        System.out.println("\nIhr Ergebnis ist: " + ergebnis);
    }

    public static void main(String[] args) {
        new Multiplikation();
    }
}
