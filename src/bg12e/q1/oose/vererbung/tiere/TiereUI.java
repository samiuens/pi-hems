package bg12e.q1.oose.vererbung.tiere;

public class TiereUI {
    public static void main(String[] args) {
        Loewe l = new Loewe("Fleisch", true);
        Schwalbe s = new Schwalbe("Brot", false);
        System.out.println(l.macheGeraeusch());
        System.out.println(s.macheGeraeusch());
    }
}
