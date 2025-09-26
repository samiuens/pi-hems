package bg11f.e1.zeichenkette;

import java.util.Scanner;

public class UpDownRueck {
    public UpDownRueck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie einen String ein: ");
        String eingabe = sc.nextLine();
        System.out.println();
        sc.close();

        System.out.println(eingabe.toLowerCase());
        System.out.println(eingabe.toUpperCase());
        for(int i = eingabe.length() - 1; i >= 0; i--) {
            System.out.print(eingabe.charAt(i));
        }
        System.out.println();
        System.out.println(eingabe.length());
    }

    public static void main(String[] args) {
        new UpDownRueck();
    }
}
