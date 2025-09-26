package bg11f.e2.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamGuide {
    public StreamGuide() {
        // creating array
        int sizeArray = 10;
        int[] array = new int[sizeArray];
        // filling array with random numbers (from x till "radiusRandom")
        int radiusRandom = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandom(radiusRandom);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("kleinste Zahl: " + Arrays.stream(array).min().getAsInt());
        System.out.println("größte Zahl: " + Arrays.stream(array).max().getAsInt());
    }

    public static void main(String[] args) {
        new StreamGuide();
    }

    public static int getRandom(int radius) {
        return (int) (Math.random() * radius);
    }
}
