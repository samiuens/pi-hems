package bg11f.e1.verzweigung.struktogramm;

import java.util.Scanner;

public class VerzweigungStart3 {
    public VerzweigungStart3() {
        int pin = 2300;

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ihre PIN ein: ");
        int eingabe = sc.nextInt();
        sc.close();
        String stellen = String.valueOf(eingabe);
        if (stellen.length() == 4) {
            System.out.println("Gute Eingabe.");
            if (pin == eingabe) {
                System.out.println("Zugang!");
            } else {
                System.err.println("Zugang verweigert.");
            }
            System.out.println("Deine eingegebene PIN war: " + eingabe);
            System.out.println("Die richtige PIN lautet: " + pin);
        } else {
            System.err.println("Schlechte Eingabe.");
        }
    }

    public static void main(String[] args) {
        new VerzweigungStart3();
    }
}
