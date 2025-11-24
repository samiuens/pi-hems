package bg12e.q1.oose.uml.sd.bibliothek;

import java.util.Random;
import java.util.UUID;

public class BibliothekUI {
    private final Bibliothekssystem bibliothekssystem;

    public BibliothekUI() {
        this.bibliothekssystem = new Bibliothekssystem();

        Leser leser = bibliothekssystem.erfasseLeser("Sami");
        Leser leser2 = bibliothekssystem.erfasseLeser("Max");
        Leser leser3 = bibliothekssystem.erfasseLeser("John");
        Leser leser4 = bibliothekssystem.erfasseLeser("Franz");

        Random rndm = new Random();
        String[] buecher = {"The Vanishing Half", "Der zerbrochne Krug", "Die Räuber", "Atomic Habits"};
        for (String name : buecher) {
            String isbn = UUID.randomUUID().toString();
            Buch buch = new Buch(isbn, name);
            bibliothekssystem.hinzufuegen(buch);

            int anzahlExemp = rndm.nextInt(5) + 1;
            for (int j = 0; j < anzahlExemp; j++) {
                Exemplar e = new Exemplar(UUID.randomUUID().toString(), buch);
                buch.hinzufuegen(e);
            }

            bibliothekssystem.ausleihen(leser.getLeserNr(), bibliothekssystem.sucheFreieInventarNr(buch));
            bibliothekssystem.ausleihen(leser2.getLeserNr(), bibliothekssystem.sucheFreieInventarNr(buch));
            bibliothekssystem.ausleihen(leser3.getLeserNr(), bibliothekssystem.sucheFreieInventarNr(buch));
            bibliothekssystem.ausleihen(leser4.getLeserNr(), bibliothekssystem.sucheFreieInventarNr(buch));
        }
        System.out.println();
        System.out.println(this.bibliothekssystem);
    }

    public static void main(String[] args) {
        new BibliothekUI();
    }
}
