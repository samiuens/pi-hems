package bg11f.e1.zeichenkette;

import java.util.Scanner;

public class Zeichenhaeufigkeit {
    public Zeichenhaeufigkeit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gebe deinen String ein: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        System.out.println("Gebe das Zeichen, welches gezählt werden soll, ein: ");
        char frequentChar = sc.nextLine().charAt(0);
        sc.close();
        int frequency = 0;
        for(int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            if(letter == frequentChar) frequency++;
        }
        System.out.println("\n" + "Häufigkeit: %s".formatted(frequency));
    }

    public static void main(String[] args) {
        new Zeichenhaeufigkeit();
    }
}
