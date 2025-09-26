package bg11f.e1.zeichenkette;

public class ZeichenketteZiffern {
    public ZeichenketteZiffern() {
        String s = "Hast du 1 Banane? Nein ich habe 2!";
        //String s = "Hallo Welt!";
        boolean hatZiffern = false;
        for(int i = 0; i < s.length(); i++) {
            int sa = s.charAt(i);
            if(sa >= 48 && sa <= 57) {
                hatZiffern = true;
                break;
            }
        }
        System.out.println(hatZiffern);
    }

    public static void main(String[] args) {
        new ZeichenketteZiffern();
    }
}
