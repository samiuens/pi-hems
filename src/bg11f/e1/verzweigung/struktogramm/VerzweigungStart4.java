package bg11f.e1.verzweigung.struktogramm;

import java.util.Scanner;

public class VerzweigungStart4 {
    public VerzweigungStart4() {
        Scanner sc = new Scanner(System.in);
        int zahl1, zahl2;
        int ergebnis = 0;
        System.out.println("Geben sie die erste Zahl ein: ");
        zahl1 = sc.nextInt();
        System.out.println("Geben sie die zweite Zahl ein: ");
        zahl2 = sc.nextInt();
        sc.close();
        if (zahl1 >= zahl2) {
            if (zahl1 % 2 == 0) {
                ergebnis = zahl1 - zahl2;
            }
        } else {
            if (zahl2 % 2 == 1) {
                ergebnis = zahl2 * zahl1;
            } else {
                ergebnis = zahl2 * zahl2;
            }
            System.out.println("Zahl2 >= Zahl1!");
        }
        System.out.println("");
        System.out.println("Die erste Zahl war: " + zahl1);
        System.out.println("Die zweite Zahl war: " + zahl2);
        System.out.println("");
        System.out.println("Ergebnis: " + ergebnis);
    }

    public static void main(String[] args) {
        new VerzweigungStart4();
    }
}
