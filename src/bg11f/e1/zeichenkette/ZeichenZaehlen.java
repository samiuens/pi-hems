package bg11f.e1.zeichenkette;

public class ZeichenZaehlen {
    public ZeichenZaehlen() {
        char x = 'A';
        int xa = x;
        String s = "BANANE";
        int zaehler = 0;
        for(int i = 0; i < s.length(); i++) {
            int sa = s.charAt(i);
            if(sa == xa) {
                zaehler++;
            }
        }
        System.out.println(zaehler);
    }

    public static void main(String[] args) {
        new ZeichenZaehlen();
    }
}
