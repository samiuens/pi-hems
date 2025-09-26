package bg11f.e1.zeichenkette;

public class ZeichenketteEntfernen {
    public ZeichenketteEntfernen() {
        char x = 'l';
        int xa = x;
        String s = "Hallo, wie geht es Ihnen?";
        String erg = "";

        for(int i = 0; i < s.length(); i++) {
            int sa = s.charAt(i);
            if(sa != xa) {
                erg += (char) sa;
            }
        }
        System.out.println(erg);
    }

    public static void main(String[] args) {
        new ZeichenketteEntfernen();
    }
}
