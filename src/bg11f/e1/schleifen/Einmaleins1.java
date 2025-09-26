package bg11f.e1.schleifen;

public class Einmaleins1 {
    public Einmaleins1() {
        for(int i = 1; i <= 10; i++) {
            for(int x = 1; x <= (i * 10); x++) {
                if(x % i == 0) System.out.print(x + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Einmaleins1();
    }
}
