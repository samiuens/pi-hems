package bg11f.e2.getset.warenhaus;

public class WarenUI {
    public WarenUI() {
        Lager l1 = new Lager(3);
        Lager l2 = new Lager(3);

        Ware w1 = new Ware("Tisch", 100);
        Ware w2 = new Ware("Stuhl", 50);
        Ware w3 = new Ware("Lampe", 20);
        Ware w4 = new Ware("Sofa", 300);
        Ware w5 = new Ware("Regal", 150);

        l1.hinzufuegen(w1);
        l1.hinzufuegen(w2);
        l1.hinzufuegen(w3);
        l1.hinzufuegen(w4);
        l2.hinzufuegen(w5);
        System.out.println(l1.getBestand());
        System.out.println(l2.getBestand());
    }

    public static void main(String[] args) {
        new WarenUI();
    }
}
