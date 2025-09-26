package bg11f.e1.schleifen;

import java.util.Scanner;

public class Zahlensumme {
    public Zahlensumme() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie einen Startwert ein.");
        int i = sc.nextInt();
        
        int zahl = 0;
        while(i < 2011) {
            i++;
            zahl += i;
        }

        sc.close();
        System.out.println("Die Summe ist: " + zahl);
    }

    public static void main(String[] args) {
        new Zahlensumme();
    }
}
