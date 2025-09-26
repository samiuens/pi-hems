package bg11f.e1.schleifen;

public class ZahlenSieb1 {
    public ZahlenSieb1() {
        System.out.println("for-Methode:");
        for(int i = 0; i <= 150; i++) {
            if(i % 11 == 0 || i % 23 == 0) System.out.print(i + ", ");
        }

        System.out.println("\n");
        System.out.println("while-Methode:");
        int i = 0;
        while(i <= 150) {
            if(i % 11 == 0 || i % 23 == 0) System.out.print(i + ", ");
            i++;
        }
    }

    public static void main(String[] args) {
        new ZahlenSieb1();
    }
}
