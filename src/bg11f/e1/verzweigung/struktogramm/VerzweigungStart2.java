package bg11f.e1.verzweigung.struktogramm;

import java.util.Scanner;

public class VerzweigungStart2 {
    public VerzweigungStart2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl ein: ");
        int zahl = sc.nextInt();
        sc.close();
        if (zahl > 999 && zahl < 10000) {
            System.out.println("Gute Eingabe.");
        } else {
            System.out.println("Schlechte Eingabe.");
        }
        System.out.println(zahl);
    }

    public static void main(String[] args) {
        new VerzweigungStart2();
    }
}
