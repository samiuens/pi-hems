package bg11f.e1.schleifen;

import java.util.Scanner;

public class AnzahlZiffern {
    public AnzahlZiffern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl ein: ");
        long zahl = sc.nextLong();
        sc.close();
        
        int stellen = 0;
        if(zahl == 0) stellen = 1;
        while(zahl > 0) {
            zahl = zahl / 10;
            stellen++;
        }
        
        System.out.println("Ihre Zahl hat: " + stellen + " Stellen.");
    }

    public static void main(String[] args) {
        new AnzahlZiffern();
    }
}
