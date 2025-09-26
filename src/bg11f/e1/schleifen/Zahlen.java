package bg11f.e1.schleifen;

public class Zahlen {
    public Zahlen() {
        for(int i = 0; i <= 1000; i++) {
            // 0. teilbar durch 9;  1. teilbar durch 7
            boolean[] teilbarkeit = {false, false};
            if(i % 9 == 0) teilbarkeit[0] = true;
            if(i % 7 == 0) teilbarkeit[1] = true;

            if(teilbarkeit[0] || teilbarkeit[1]) {
                System.out.print(i + "\t-> teilbar durch ");
                if(teilbarkeit[0] && teilbarkeit[1]) {
                    System.out.print("9 und 7");
                } else if(teilbarkeit[0]) {
                    System.out.print("9");
                } else if(teilbarkeit[1]) {
                    System.out.print("7");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new Zahlen();
    }
}
