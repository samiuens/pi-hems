package bg11f.e1.zeichenkette;

import java.util.Scanner;

public class AuspressenE {
    public AuspressenE() {
        Scanner sc = new Scanner(System.in);
        String zeichenkette = sc.nextLine();
        int[] replace = { 69, 101 };
        sc.close();
        String ergebnis = "";
        for(int i = 0; i < zeichenkette.length(); i++) {
            int code = zeichenkette.codePointAt(i);
            boolean found = false;
            for(int a = 0; a < replace.length; a++) {
                if(code == replace[a]) found = true;
            }
            if(!found) {
                ergebnis += zeichenkette.charAt(i);
            }
        }
        System.out.println("Ausgabe: %s".formatted(ergebnis));
    }

    public static void main(String[] args) {
        new AuspressenE();
    }
}
