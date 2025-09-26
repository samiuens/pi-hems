package bg11f.e1.verzweigung;

import java.util.Scanner;

public class NonFettKalkulator {
    public NonFettKalkulator() {
        Scanner sc = new Scanner(System.in);
        float preisPfundPackungA, preisPfundPackungB;
        int prozentPackungA, prozentPackungB;
        
        System.out.println("Geben sie den Preis pro Pfund der Packung \"A\" (Euro-/Cent-Betrag)");
        preisPfundPackungA = sc.nextFloat();
        System.out.println("Geben sie den Prozentanteil an magerem Fleisch in der Packung \"A\" (Ganzzahl in %)");
        prozentPackungA = sc.nextInt();

        System.out.println("Geben sie den Preis pro Pfund der Packung \"B\" (Euro-/Cent-Betrag)");
        preisPfundPackungB = sc.nextFloat();
        System.out.println("Geben sie den Prozentanteil an magerem Fleisch in der Packung \"B\" (Ganzzahl in %)");
        prozentPackungB = sc.nextInt();
        sc.close();

        float differenzA = (preisPfundPackungA / prozentPackungA) * 100;
        float differenzB = (preisPfundPackungB / prozentPackungB) * 100;
        System.out.println("In der Packung \"A\" kostet pro Pfund mageres Fleisch: " + differenzA + "€");
        System.out.println("In der Packung \"B\" kostet pro Pfund mageres Fleisch: " + differenzB + "€");
        
        if(differenzA < differenzB) {
            System.out.println("Packung \"A\" ist preiswerter.");
        } else if(differenzA == differenzB) {
            System.out.println("Die beiden Packungen \"A\" und \"B\" sind preisgleich.");
        } else if(differenzA > differenzB) {
            System.out.println("Packung \"B\" ist preiswerter.");
        }
    }

    public static void main(String[] args) {
        new NonFettKalkulator();
    }  
}
