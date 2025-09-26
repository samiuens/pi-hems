package bg11f.e1.felder.eindimensional;
import java.util.Scanner;

public class Feldeingaben {
    public Feldeingaben() {
        int[] array = new int[1000];
        int lastInput = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++) {
            System.out.print("Geben sie die " + (i + 1) + ". Zahl ein: ");
            int input = sc.nextInt();
            if(input == 0) break;
            lastInput++;
            array[i] = input;
        }
        sc.close();
        System.out.println("Das Programm wurde beendet.");
        System.out.println("Sie haben " + lastInput + " Eingaben getätigt!");
        int summe = 0;
        for(int i = 0; i < lastInput; i++) {
            summe += array[i];
        }
        System.out.println("\nDie Summe beträgt: " + summe);
    }

    public static void main(String[] args) {
        new Feldeingaben();
    }
}
