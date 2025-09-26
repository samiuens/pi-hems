package bg11f.e1.verzweigung;

import java.util.Scanner;

public class BestellUeberpruefung {
    public BestellUeberpruefung() {
        final int preisSchraube = 5;
        final int preisMutter = 3;
        final int preisUnterlegscheibe = 1;

        int anzahlSchrauben, anzahlMuttern, anzahlUnterlegscheiben;
        int gesamtbetrag;

        Scanner sc = new Scanner(System.in);
        System.out.print("Anzahl der Schrauben: ");
        anzahlSchrauben = sc.nextInt();
        System.out.print("Anzahl der Muttern: ");
        anzahlMuttern = sc.nextInt();
        System.out.print("Anzahl der Unterlegscheiben: ");
        anzahlUnterlegscheiben = sc.nextInt();
        sc.close();

        gesamtbetrag = (anzahlSchrauben * preisSchraube) + (anzahlMuttern * preisMutter)
                + (anzahlUnterlegscheiben * preisUnterlegscheibe);

        if (anzahlSchrauben > anzahlMuttern) {
            System.out.println("Kontrollieren Sie Ihre Bestellung!");
        }
        System.out.println("Gesamtbetrag: " + gesamtbetrag);
    }

    public static void main(String[] args) {
        new BestellUeberpruefung();
    }
}
