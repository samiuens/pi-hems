package bg11f.e1.testen;

// formaler Fehler: nur Scanner importieren, um Ressourcen zu sparen
import java.util.Scanner;

/**
 * Energiekostenersparnis
 * berechnet die Energiekostenersparnis (pro Jahr), wenn z.B. ein altes
 * Gerät mit Leistung P1 gegen ein neues Geret mit einer geringeren
 * Leistung P2 ausgetauscht wird. Formel für Kosten K: K = k * P * t
 * (k in [Cent/kWh}, P in [W] (Watt), t in [h] (Stunden))
 *
 * @version 2.0, 18.10.2013
 * @author P. Schug
 */

// Compilerfehler: nicht benötige Parameter beim Erstellen einer Klasse
public class Energiekostenersparnis {

    // Compilerfehler: Klassenname falsch geschrieben
    public Energiekostenersparnis() {
        System.out.println("\n*************************************"); // fehlendes Semikolon
        System.out.println(" * Energiekostenersparnis *"); // falscher Zeilenumbruch
        // Syntax-Fehler: "\m" kein bekanntes Escape-Zeichen
        System.out.println(" *************************************\n");
        Scanner sc = new Scanner(System.in);
        System.out.print(" Leistung P1 [W]: ");
        double p1 = sc.nextDouble();
        System.out.print(" Leistung P2 [W]: ");
        // Compiler-Fehler: kein Abstand (zwischen Typ und Name) führt zum nicht initalisieren der Variable
        double p2 = sc.nextDouble();
        System.out.print(" Kosten pro kWh [Cent/kWh]: ");
        double k = sc.nextDouble();
        // Compiler-Fehler: fehlendes Anführungszeichen am Ende, um den String anzugeben
        System.out.print(" Betriebsdauer [h] (am Tag): ");
        // Compiler/Syntaxfehler: falsche Methode des Scanners -> nextDouble();
        double betriebsdauerTag = sc.nextDouble();
        // formaler Fehler: Scanner wird nicht geschlossen
        sc.close();
        double kosten1 = p1 * k * betriebsdauerTag * 356.0 / 1000.0;
        double kosten2 = p2 * k * betriebsdauerTag * 356.0 / 1000.0;
        // Compiler & logischer Fehler: Zahl 0 als String bei einer int-Variable; int sollte double sein, da eine
        // Berechnung mit double stattfindet und sonst, beim Casten, Informationen
        // verloren gehen.
        double ersparnis = 0;
        ersparnis = kosten1 - kosten2;
        ersparnis = ersparnis / 100.0; // um von Cent auf Euro zu rechnen
        // logischer Fehler: falsche Verwendung des Modulo-Operators
        //ersparnis = Math.round(ersparnis + Math.pow(10, 2)) / Math.pow(10, 2);
        ersparnis = Math.round(ersparnis * 100.0) / 100.0;
        // logischer Fehler: Vergleich fehlerhaft
        if (ersparnis > 0) {
            System.out.println("Ersparnis pro Jahr: " + ersparnis + " Euro");
        } else {
            System.out.println("Mehrausgabe pro Jahr: " + ersparnis + " Euro");
        }
    }

    // formaler Fehler: String array sollte als args gekennzeichnet werden
    public static void main(String[] args) {
        new Energiekostenersparnis();
    }
}
