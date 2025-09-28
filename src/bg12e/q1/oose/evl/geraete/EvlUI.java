package bg12e.q1.oose.evl.geraete;

public class EvlUI {
    public static void main(String[] args) {
        GeraetelisteEVL liste = new GeraetelisteEVL();

        Geraet g1 = new Geraet("iPhone 14 Pro","Apple");
        Geraet g2 = new Geraet("Galaxy Z Fold 7","Samsung", "ABC123DEF999");
        Geraet g3 = new Geraet("MacBook Pro, 14 Zoll (M4 Pro)","Apple");
        Geraet g4 = new Geraet("Lenovo ThinkPad X9","Lenovo");
        Geraet g5 = new Geraet("Galaxy S25 Ultra", "Samsung", "123");

        liste.hinzufuegen(g1);
        liste.hinzufuegen(g2);
        liste.hinzufuegen(g3);
        liste.hinzufuegen(g4);
        liste.hinzufuegen(g5);

        //liste.entfernen(g1);
        //liste.entfernen(g5);
        //liste.entfernen("ABC123DEF999");

        System.out.println(liste);
    }
}
