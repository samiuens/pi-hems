package bg12e.q1.oose.evl.kunden;

import java.util.Random;

public class EvlUITesting {
    public static void UI_TESTING(int anzahlKunden) {
        int erstellteTestKunden = 0;

        // Erstelle neue Kundenliste
        KundenlisteEVL evl = new KundenlisteEVL();

        // Erstelle X Beispiel Kunden
        System.out.println("Erstelle %s Kunden".formatted(anzahlKunden));
        System.out.println("\n-------------------------------\n");
        for(int i = 0; i < anzahlKunden; i++) {
            Kunde k = new Kunde("Test " + (i + 1), false);
            evl.hinzufuegen(k);
            erstellteTestKunden++;
            System.out.println("Erstelle Kunde %s".formatted(i + 1));
        }
        System.out.println("\n-------------------------------\n");


        // Gebe Liste aus
        System.out.println(evl);
        System.out.println("\n-------------------------------\n");System.out.println();

        // Überprüfe ob Anzahl stimmt
        System.out.println("Überprüfe ob die Länge der Liste, mit der gegebenen Anzahl an Beispielkunden übereinstimmt.");
        if(evl.getAnzahl() == anzahlKunden && evl.getAnzahl() == erstellteTestKunden) {
            System.out.println("> Länge der Liste stimmt mit der ahl der Kunden überein.");
        } else {
            System.out.println("[!] Länge der Liste stimmt NICHT mit der Anzahl der Kunden überein!");
        }
        System.out.println("\n-------------------------------\n");

        // Entferne Kunde an erster Stelle
        System.out.println("Entferne Kunde vom ersten Knoten");
        int hashCodeErsterKnotenBefore = evl.getErsterKnoten().hashCode();
        int removeIndexStart = 0;
        Knoten knotenAtRemoveIndexStart = evl.getKnotenAtIndex(removeIndexStart);
        System.out.println("Entferne Kunde an Index %s -> (%s)".formatted(removeIndexStart, knotenAtRemoveIndexStart.getKunde().getName()));
        evl.entfernen(knotenAtRemoveIndexStart.getKunde());
        erstellteTestKunden--;

        if(evl.getErsterKnoten().hashCode() != hashCodeErsterKnotenBefore) {
            System.out.println("> Erster Kunde wurde erfolgreich entfernt; neuer Hash-Code für ersten Knoten");
        } else {
            System.out.println("[!] Erster Kunde wurde nicht entfernt, Länge der Liste ist gleich zum Anfang & falscher Hash-Code für ersten Knoten!");
        }
        System.out.println("Hash-Code: %s ---> %s".formatted(hashCodeErsterKnotenBefore, evl.getErsterKnoten().hashCode()));
        System.out.println(evl);
        System.out.println("\n-------------------------------\n");

        // Entferne Kunde an zufälliger Stelle
        int removeIndex = getRandomIndex(erstellteTestKunden);
        Knoten knotenAtRemoveIndex = evl.getKnotenAtIndex(removeIndex);
        System.out.println("Entferne Kunde an Index %s -> (%s)".formatted(removeIndex, knotenAtRemoveIndex.getKunde().getName()));
        evl.entfernen(knotenAtRemoveIndex.getKunde());
        erstellteTestKunden--;

        if(evl.getAnzahl() == erstellteTestKunden) {
            System.out.println("> Kunde wurde erfolgreich entfernt.");
        } else {
            System.out.println("[!] Kunde wurde nicht entfernt, Länge der Liste ist gleich zum Anfang!");
        }
        System.out.println(evl);
        System.out.println("\n-------------------------------\n");

        // Entferne Kunde an letzter Stelle
        System.out.println("Entferne Kunde an letzter Stelle");
        int hashCodeLetzterKnotenBefore = evl.getLetztenKnoten().hashCode();
        int removeIndexEnd = erstellteTestKunden - 1;
        Knoten knotenAtRemoveIndexEnd = evl.getKnotenAtIndex(removeIndexEnd);
        System.out.println("Entferne Kunde an Index %s -> (%s)".formatted(removeIndexEnd, knotenAtRemoveIndexEnd.getKunde().getName()));
        evl.entfernen(knotenAtRemoveIndexStart.getKunde());
        erstellteTestKunden--;

        if(evl.getAnzahl() == erstellteTestKunden && evl.getLetztenKnoten().hashCode() != hashCodeLetzterKnotenBefore) {
            System.out.println("> Letzter Kunde wurde erfolgreich entfernt; neuer Hash-Code für letzten Knoten");
        } else {
            System.out.println("[!] Letzter Kunde wurde nicht entfernt, Länge der Liste ist gleich zum Anfang & falscher Hash-Code für letzten Knoten!");
        }
        System.out.println("Hash-Code: %s ---> %s".formatted(hashCodeLetzterKnotenBefore, evl.getLetztenKnoten().hashCode()));
        System.out.println(evl);
        System.out.println("\n-------------------------------\n");

        // Füge Kunde am Ende der Liste hinzu
        boolean sollKundeAtEndVIP = true;
        System.out.println("Erstelle Kunde am Ende Liste mit dem Status VIP (%s)".formatted(sollKundeAtEndVIP));
        System.out.println();
        Kunde kundeAtEnd = new Kunde("Ende der Liste", sollKundeAtEndVIP);
        evl.hinzufuegen(kundeAtEnd);
        erstellteTestKunden++;

        Knoten letzterKnoten = evl.getLetztenKnoten();
        if(letzterKnoten.getKunde().equals(kundeAtEnd)) {
            System.out.println("> Kunde wurde erfolgreich am Ende der Liste eingefügt");
            if(kundeAtEnd.isIstVIP() == sollKundeAtEndVIP) {
                System.out.println("VIP-Status stimmt überein.");
            }
        } else {
            System.out.println("[!] Kunde wurde am Ende der Liste nicht gefunden!");
        }
        System.out.println(kundeAtEnd);
        System.out.println("\n-------------------------------\n");

        // Suche einen Kunden
        int randomSearchIndex = getRandomIndex(evl.getAnzahl());
        System.out.println("Suche Kunde am zufälligen Index %s".formatted(randomSearchIndex));
        Knoten randomSearchKnoten = evl.getKnotenAtIndex(randomSearchIndex);
        Kunde searchKunde = randomSearchKnoten.getKunde();
        if(searchKunde != null) {
            System.out.println("> Kunde erfolgreich gefunden: %s".formatted(searchKunde.getName()));
        } else {
            System.out.println("[!] Kunde konnte nicht gefunden werden");
        }
        System.out.println("\n-------------------------------\n");
    }

    public static int getRandomIndex(int length) {
        Random rndm = new Random();
        return rndm.nextInt(length);
    }

    public static void main(String[] args) {
        UI_TESTING(5);
    }
}
