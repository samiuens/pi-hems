package bg11f.e1.schleifen;

public class Zahlenfolge {
    public Zahlenfolge() {
        int maximaleZahl = 5;

        for(int i = 0; i < maximaleZahl; i++) {
            for(int j = 1; j < i + 2; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Zahlenfolge();
    }
}
