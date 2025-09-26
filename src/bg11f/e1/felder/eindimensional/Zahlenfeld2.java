package bg11f.e1.felder.eindimensional;

import java.util.Scanner;

public class Zahlenfeld2 {
    public Zahlenfeld2() {
        int[] zahlen = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < zahlen.length; i++) {
            System.out.print("Geben sie die " + (i + 1) + ". Zahl ein: ");
            int input = sc.nextInt();
            zahlen[i] = input;
        }
        sc.close();

        for(int i = zahlen.length - 1; i >= 0; i--) {
            System.out.print(zahlen[i] + ", ");
        }
    }

    public static void main(String[] args) {
        new Zahlenfeld2();
    }
}
