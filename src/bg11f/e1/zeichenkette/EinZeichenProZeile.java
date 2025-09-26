package bg11f.e1.zeichenkette;

import java.util.Scanner;

public class EinZeichenProZeile {
    public EinZeichenProZeile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie einen String ein: ");
        String eingabe = sc.nextLine();
        sc.close();
        System.out.println();
        for(int i = 0; i < eingabe.length(); i++) {
            System.out.println(eingabe.charAt(i));
        }
    }

    public static void main(String[] args) {
        new EinZeichenProZeile();
    }
}
