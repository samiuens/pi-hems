package bg11f.e1.schleifen;

public class DreierSieb1 {
    public DreierSieb1() {
        System.out.println("for-Methode:");
        for(int i = 0; i <= 30; i++) {
            if(i % 3 == 0) System.out.print(i + ", ");
        }

        System.out.println("\n");
        System.out.println("while-Methode:");
        int i = 0;
        while(i <= 30) {
            if(i % 3 == 0) System.out.print(i + ", ");
            i++;
        }
    }

    public static void main(String[] args) {
        new DreierSieb1();
    }
}
