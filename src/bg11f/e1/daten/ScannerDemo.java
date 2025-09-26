package bg11f.e1.daten;

import java.util.Scanner;
public class ScannerDemo {
    public ScannerDemo() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bitte geben sie eine Zahl ein: ");
        int zahl = sc.nextInt();
        System.out.println("Deine Zahl ist: " + zahl);

        System.out.println("Bitte geben sie eine Kommazahl ein: ");
        float kommazahl = sc.nextFloat();
        System.out.println("Deine Kommazahl ist: " + kommazahl);

        System.out.println("Bitte geben sie eine Gleitkommazahl ein: ");
        double gleitkommazahl = sc.nextDouble();
        System.out.println("Deine Gleitkommazahl ist: " + gleitkommazahl);

        System.out.println("Bitte geben sie einen Wahrheitswert ein: ");
        boolean wahrheitswert = sc.nextBoolean();
        System.out.println("Deine Wahrheitswert ist: " + wahrheitswert);

        System.out.println("Bitte geben sie einen großen Zahlenwert ein: ");
        long grossezahl = sc.nextLong();
        System.out.println("Dein großer Zahlenwert ist: " + grossezahl);

        System.out.println("Bitte geben sie einen Text ein: ");
        String text = sc.nextLine();
        System.out.println("Dein Text ist: " + text);

        sc.close();
    }

    public static void main(String[] args) {
        new ScannerDemo();
    }
}
