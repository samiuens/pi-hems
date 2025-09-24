package bg12e.q1.oose.autohaus;

public class AutohausUI {
    public static void main(String[] args) {
        Autohaus ah = new Autohaus("Test");

        Auto a1 = new Auto("M4 Competition", 12000);
        Auto a2 = new Auto("S63 AMG", 35000);
        Auto a3 = new Auto("GT3 RS", 385);
        Auto a4 = new Auto("Passat", 285000);
        Auto a5 = new Auto("RS7", 8000);
        ah.hinzufuegen(a1);
        ah.hinzufuegen(a2);
        ah.hinzufuegen(a3);
        ah.hinzufuegen(a4);
        ah.entfernen(a2);
        ah.hinzufuegen(a5);

        System.out.println(ah);
    }
}
