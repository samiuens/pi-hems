package bg11f.e1.schleifen;

public class Schachbrett1 {
    public Schachbrett1() {
        for(int i = 1; i <= 8; i++) {
            for(int j = i; j < (i + 8); j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Schachbrett1();
    }
}
