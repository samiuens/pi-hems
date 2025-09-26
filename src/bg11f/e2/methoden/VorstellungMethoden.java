package bg11f.e2.methoden;

import java.util.Arrays;
import java.util.Scanner;

public class VorstellungMethoden {
    public VorstellungMethoden() {}

    public static void main(String[] args) {
        VorstellungMethoden m = new VorstellungMethoden();
        Scanner sc = new Scanner(System.in);
        int[] array = m.arrayTask(sc, 10, 3);
        sc.close();
        System.out.println(Arrays.toString(array));
    }

    // generation einer zufallszahl (mit angabe des bereichs) -> (int)
    // gebe ein int[] array per konsole aus -> (void)

    // höchsten oder kleinsten wert eines arrays zurückgeben -> (int)
    // summe eines arrays -> (int)

    public int[] arrayTask(Scanner sc, int sizeArray, int amountInputs) {
        int[] array = new int[sizeArray];
        int sum = 0;
        for(int i = 0; i < amountInputs; i++) {
            System.out.println("%s. Zahl: ".formatted(i + 1));
            array[i] = sc.nextInt();
            sum += array[i];
        }
        for(int i = amountInputs - 1; i < sizeArray; i++) {
            array[i] = sum;
            sum += array[i];
        }
        return array;
    }
}
