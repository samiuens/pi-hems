package bg11f.e1.verzweigung;

import java.util.Scanner;

public class Discountpreise {
    public Discountpreise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie den Gesamtbetrag ein: ");
        int betrag = sc.nextInt();
        sc.close();
        if (betrag > 1000) {
            System.out.println("Ihr Einkauf ist rabattfähig!");
            int rabatt = betrag / 10;
            betrag = betrag - rabatt;
        } else {
            System.out.println("Ihr Einkauf erfüllt nicht den Mindestbetrag.");
        }
        System.out.println("Endbetrag: " + betrag);
    }

    public static void main(String[] args) {
        new Discountpreise();
    }
}
