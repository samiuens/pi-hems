package bg11f.e1.felder.eindimensional;

public class IntFeldDreiN {
    public IntFeldDreiN() {
        int[] array = new int[5];
        for(int n = 1; n < 5; n++) {
            array[n] = n * 3;
        }

        System.out.println("\nArray-Übersicht:");
        int summe = 0;
        for(int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ": " + array[i]);
            summe += array[i];
        }
        System.out.println("**Summe: " + summe + "**");
    }

    public static void main(String[] args) {
        new IntFeldDreiN();
    }
}
