package bg11f.e1.schleifen;

import java.util.Scanner;

public class JavaRechner {
    public JavaRechner() {
        Scanner sc = new Scanner(System.in);
        String[] menuOptions = {"EinsOderZwei", "Zahlensumme", "Multiplikation", "Zahlenspiel", "AnzahlZiffern", "Beenden"};
        System.out.println("Geben sie eine Option an (0 bis " + (menuOptions.length - 1) + "): ");
        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println(i + ". " + menuOptions[i]);
        }
        int menuChoice = sc.nextInt();
        
        while(menuChoice != 5) {
            if(menuChoice == 0) {
                EinsZwei(sc);
            } else if(menuChoice == 1) {
                Zahlensumme(sc);
            } else if(menuChoice == 2) {
                Multiplikation(sc);
            } else if(menuChoice == 3) {
                System.out.println("Dieses Programm wurde noch nicht implementiert.");
            } else if(menuChoice == 4) {
                AnzahlZiffern(sc);
            } else {
                System.out.println("Geben sie eine gültige Option ein!");
            }
        }
        sc.close();
    }

    public static void EinsZwei(Scanner sc) {
        int zahl = 0;
        while (zahl != 1 && zahl != 2) {
            System.out.println("Geben sie eine Zahl ein.");
            zahl = sc.nextInt();
            System.out.println("");
        }
        System.out.println("Ihre Eingabe war: " + zahl);
        System.out.println("Das Programm wird beendet.");
    }

    public static void Zahlensumme(Scanner sc) {
        System.out.println("Geben sie einen Startwert ein.");
        int i = sc.nextInt();
        
        int zahl = 0;
        while(i < 2011) {
            i++;
            zahl += i;
        }

        System.out.println("Die Summe ist: " + zahl);
    }

    public static void Multiplikation(Scanner sc) {
        System.out.println("Geben sie die erste Zahl ein: ");
        int zahl1 = sc.nextInt();
        System.out.println("\nGeben sie die zweite Zahl ein: ");
        int zahl2 = sc.nextInt();
        
        int i = 0, ergebnis = 0;
        while(zahl1 > i || zahl1 < i) {
            i++;
            ergebnis += zahl2;
        }
        System.out.println("\nIhr Ergebnis ist: " + ergebnis);
    }
    
    public static void AnzahlZiffern(Scanner sc) {
        System.out.println("Geben sie eine Zahl ein: ");
        long zahl = sc.nextLong();
        
        int stellen = 0;
        if(zahl == 0) stellen = 1;
        while(zahl > 0) {
            zahl = zahl / 10;
            stellen++;
        }
        
        System.out.println("Ihre Zahl hat: " + stellen + " Stellen.");
    }

    public static void main(String[] args) {
        new JavaRechner();
    }
}
