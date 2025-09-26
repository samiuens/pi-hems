package bg11f.e2.getset.spieler;

public class SpielerUi {
    public static void main(String[] args) {
        new SpielerUi();
    }

    public SpielerUi() {
        Spieler s1 = new Spieler("Sami");
        s1.setGegenstand("Schwert");
        System.out.println(s1.toString());
    }
}
