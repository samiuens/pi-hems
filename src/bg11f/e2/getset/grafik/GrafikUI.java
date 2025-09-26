package bg11f.e2.getset.grafik;

public class GrafikUI {
    public GrafikUI() {
        Punkt p1 = new Punkt(10, 20, new Farbe(255, 255, 255));
        Punkt p2 = new Punkt(5, 3, 0, 255, 0);
        System.out.println(p1);
        System.out.println(p2);
    }

    public static void main(String[] args) {
        new GrafikUI();
    }
}
