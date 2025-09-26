package bg11f.e1.zeichenkette;

public class ZeichenketteZiffernFeld {
    public ZeichenketteZiffernFeld() {
        String s = "Hallo, ich bin 18 Jahre alt.";
        boolean ziffern = false;
        char[] zeichen = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for(int i = 0; i < s.length(); i++) {
            int sz = s.charAt(i);
            for(int z = 0; z < zeichen.length;) {
                if(sz == zeichen[z]) ziffern = true;
                break;
            }
        }
        System.out.println(ziffern);
    }

    public static void main(String[] args) {
        new ZeichenketteZiffernFeld();
    }
}
