package bg11f.e1.schleifen;

import java.util.Scanner;

public class DreieckSterne1 {
    public DreieckSterne1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie die Anzahl der Zeilen ein: ");
        int anzahlZeilen = sc.nextInt();
        sc.close();

        System.out.println("for-Schleife: ");
        for(int x = 0; x <= anzahlZeilen; x++) {
            for(int y = 0; y < x; y++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("while-Schleife: ");
    }

    public static void main(String[] args) {
        new DreieckSterne1();
    }
}
