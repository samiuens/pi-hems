package bg12e.q1.oose.vererbung.auto;

public class AutoUI {
    public static void main(String[] args) {
        Auto a1 = new Auto("DA-AA-1111", "BMW", "M4 Competition", "schwarz-metallic");
        Cabriolet c1 = new Cabriolet("DA-BB-2222", "Mercedes", "SL63 Cabrio", "weiß", "weiß-matt");
        a1.fahren(500);
        c1.fahren(2500);
        System.out.println(a1);
        System.out.println(c1);
    }
}
