package bg11f.e1.hospitation;

import java.util.Arrays;

public class Sortierung {
    public Sortierung() {
        int[] zahlen = new int[10];
        for(int i = 0; i < zahlen.length; i++) {
            zahlen[i] = (int)(Math.random() * 100);
            System.out.print(zahlen[i] + " ");
        }
        for(int z = 0; z < zahlen.length; z++) {
            for(int q = 0; q < zahlen.length; q++) {
                if(q == zahlen.length - 1) break;
                if(zahlen[q] > zahlen[q + 1]) {
                    int q1 = zahlen[q];
                    zahlen[q] = zahlen[q + 1];
                    zahlen[q + 1] = q1;
                }
            }
        }


        System.out.println("\nSortierung:");
        for(int o = 0; o < zahlen.length; o++) {
            System.out.print(zahlen[o] + " ");
        }
        System.out.println("\n" + Arrays.toString(Arrays.stream(zahlen).sorted().toArray()));
    }

    public static void main(String[] args) {
        new Sortierung();
    }
}
