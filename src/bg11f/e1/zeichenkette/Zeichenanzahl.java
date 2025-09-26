package bg11f.e1.zeichenkette;

import java.util.Scanner;

public class Zeichenanzahl {
    public Zeichenanzahl() {
        Scanner sc = new Scanner(System.in);
        String zeichenkette = sc.nextLine();
        sc.close();
        char[] count = "abcdefghijklmnopqrstuvwxyzäöüß".toCharArray();
        boolean ignoreCase = true;

        int zaehler = 0;
        for(int i = 0; i < zeichenkette.length(); i++) {
            int code = zeichenkette.charAt(i);
            boolean found = false;
            for(int c = 0; c < count.length; c++) {
                char lowerCase = Character.toLowerCase(count[c]);
                char upperCase = Character.toUpperCase(count[c]);
                if(ignoreCase) {
                    if(code == lowerCase || code == upperCase) found = true;
                } else {
                    if(code == count[c]) found = true;
                }
            }
            if(found) {
                zaehler++;
            }
        }
        System.out.println("Ausgabe: %s Buchstaben aus dem deutschen Alphabet".formatted(zaehler));
    }

    public static void main(String[] args) {
        new Zeichenanzahl();
    }
}
