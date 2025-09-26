package bg11f.e2.getset.bankkonto;

import java.util.Scanner;

public class KontoUi {
    public KontoUi() {
        Scanner sc = new Scanner(System.in);
        Konto meinKonto = null;

        System.out.println("Willkommen bei der Bank!\n\n");
        while(true) {
            System.out.println("Was möchten Sie tun?\n1. Konto erstellen\n2. Kontoauszug anzeigen\n3. Einzahlung\n4. Auszahlung\n5. Datenauszug anzeigen\n6. Beenden");
            int auswahl = sc.nextInt();
            if(meinKonto == null && auswahl != 1 && auswahl != 6) {
                System.out.println("\nSie müssen zuerst ein Konto erstellen!");
                continue;
            }
            if(auswahl == 1) {
                sc.nextLine();
                String inhaber = scanString(sc, "Geben Sie den Vor- und Nachname des Kontoinhabers ein (getrennt mit einem Komma): ");
                String[] splitInhaber = inhaber.split(", ");
                if(splitInhaber.length != 2 || splitInhaber[0].trim().isEmpty() || splitInhaber[1].trim().isEmpty()) {
                    System.out.println("Ungültige Eingabe!");
                    continue;
                }
                String adresse = scanString(sc, "Geben Sie die Adresse des Kontoinhabers ein: ");
                String telefonnummer = scanString(sc, "Geben Sie die Telefonnummer des Kontoinhabers ein: ");
                meinKonto = new Konto(splitInhaber[0], splitInhaber[1], adresse, telefonnummer);
                System.out.println("Konto erfolgreich erstellt!\nKontonummer: %s | Inhaber: %s\n".formatted(meinKonto.getKontonummer(), meinKonto.getFullname()));
            } else if(auswahl == 2) {
                System.out.println(meinKonto.getKontoauszug());
            } else if(auswahl == 3) {
                double betrag = scanDouble(sc, "Geben Sie den Betrag ein: ");
                meinKonto.einzahlen(betrag);
                System.out.println("Einzahlung erfolgreich!\nBetrag: %s Euro | Kontostand: %s Euro\n".formatted(betrag, meinKonto.getKontostand()));
            } else if(auswahl == 4) {
                double betrag = scanDouble(sc, "Geben Sie den Betrag ein: ");
                double auszahlung = meinKonto.auszahlen(betrag);
                if(auszahlung != betrag) {
                    System.out.println("Kontostand nicht ausreichend!\nIhnen wurde der maximale Betrag ausgezahlt.");
                }
                System.out.println("Auszahlung erfolgreich!\nBetrag: %s Euro | Kontostand: %s Euro\n".formatted(auszahlung, meinKonto.getKontostand()));
            } else if(auswahl == 5) {
                System.out.println(meinKonto.getDatenauszug());
            } else if(auswahl == 6) {
                break;
            } else {
                System.out.println("Ungültige Eingabe!");
                continue;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new KontoUi();
    }

    public static String scanString(Scanner sc, String hint) {
        System.out.println(hint);
        //sc.nextLine();
        return sc.nextLine();
    }

    public static long scanLong(Scanner sc, String hint) {
        System.out.println(hint);
        return sc.nextLong();
    }

    public static double scanDouble(Scanner sc, String hint) {
        System.out.println(hint);
        return sc.nextDouble();
    }
}
