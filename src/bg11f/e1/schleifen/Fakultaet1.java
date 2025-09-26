package bg11f.e1.schleifen;

import java.util.Scanner;

public class Fakultaet1 {
    public static int BerechneFakultaet(int zahl) {
        int ergebnis = 1;
        
        for(int i = 1; i <= zahl; i++) {
            ergebnis = ergebnis * i;
        }
        return ergebnis;
    }
    
    public Fakultaet1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl an, deren Fakultät sie berechnen möchten: ");
        int zahl = sc.nextInt();
        sc.close();
        int fak = BerechneFakultaet(zahl);
        System.out.println("\n" + zahl + "! = " + fak);
    }

    public static void main(String[] args) {
        new Fakultaet1();
    }
}
