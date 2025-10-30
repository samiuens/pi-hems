package bg12e.q1.oose.vererbung.bank;

public class BankUI {
    public static void main(String[] args) {
        Girokonto girokonto = new Girokonto("123456789", 2000, 12);
        System.out.println(girokonto);
        girokonto.einzahlen(2000);
        System.out.println(girokonto);
        girokonto.auszahlen(2000);
        System.out.println(girokonto);
        girokonto.auszahlen(500);
        System.out.println(girokonto);
        girokonto.dispoBuchen();
        System.out.println(girokonto);
    }
}
