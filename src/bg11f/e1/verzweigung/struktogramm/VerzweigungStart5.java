package bg11f.e1.verzweigung.struktogramm;

import java.util.Scanner;

public class VerzweigungStart5 {
    public VerzweigungStart5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben sie ihren Namen ein: ");
        String name = sc.nextLine();
        System.out.println("Bitte geben sie ihr Alter ein: ");
        int alter = sc.nextInt();
        sc.close();
        String meldung = "";

        if (alter >= 1) {
            if (alter >= 18) {
                meldung = "Volljährig";
            } else {
                meldung = "Nicht volljährig";
            }
        } else {
            System.out.println("Falsche Eingabe des Alters!");
            meldung = "Fehleingabe";
        }
        System.out.println("");
        System.out.println("Ihr Name ist: " + name);
        System.out.println("Ihr Alter ist: " + alter);
        System.out.println(meldung);
        System.out.println("Das Programm wird beendet.");
    }

    public static void main(String[] args) {
        new VerzweigungStart5();
    }
}
