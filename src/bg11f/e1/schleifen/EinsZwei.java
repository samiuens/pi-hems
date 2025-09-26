
package bg11f.e1.schleifen;

import java.util.Scanner;

public class EinsZwei {
    public static void WieIchEsMachenMoechte() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Geben sie eine Zahl ein.");
            int zahl = sc.nextInt();
            if(zahl == 1 || zahl == 2) {break;} else {System.err.println("Fehler.");}
            System.out.println();
        }
        sc.close();
    }

    public static void WieHerrGastEsHabenMoechte() {
        Scanner sc = new Scanner(System.in);
        int zahl = 0;
        while (zahl != 1 && zahl != 2) {
            System.out.println("Geben sie eine Zahl ein.");
            zahl = sc.nextInt();
            System.out.println("");
        }
        System.out.println("Ihre Eingabe war: " + zahl);
        System.out.println("Das Programm wird beendet.");
        sc.close();
    }

    public static void main(String[] args) {
        WieHerrGastEsHabenMoechte();
    }
}