package bg12e.q1.oose.dvl.kunden;

public class DVL_UI {
    public static void main(String[] args) {
        KundenlisteDVL liste = new KundenlisteDVL();

        Kunde k1 = new Kunde("Test 1");
        Kunde k2 = new Kunde("Test 2");
        Kunde k3 = new Kunde("Test 3");
        Kunde k4 = new Kunde("Test 4");
        Kunde k5 = new Kunde("Test 5");

        liste.hinzufuegen(k1);
        liste.hinzufuegen(k2);
        liste.hinzufuegen(k3);
        liste.hinzufuegen(k4);
        liste.hinzufuegen(k5);
        System.out.println(liste);
    }
}
