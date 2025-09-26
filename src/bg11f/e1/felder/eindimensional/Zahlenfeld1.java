package bg11f.e1.felder.eindimensional;

import java.util.Random;

public class Zahlenfeld1 {
    public Zahlenfeld1() {
        int[] zahlen = new int[5];
        int summe = 0;
        for(int i = 0; i < zahlen.length; i++) {
            Random random = new Random();
            zahlen[i] = random.nextInt(10);
            summe += zahlen[i];
            System.out.print(zahlen[i] + ", ");
        }
        System.out.println("\nDie Summe des Arrays beträgt: " + summe);
    }

    public static void main(String[] args) {
        new Zahlenfeld1();
    }
}
