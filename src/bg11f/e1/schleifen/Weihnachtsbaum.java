package bg11f.e1.schleifen;

import java.util.Scanner;

public class Weihnachtsbaum {
    public Weihnachtsbaum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie ein Höhe für den Baum an: ");
        int hoehe = sc.nextInt();

        for(int h = 0; h < hoehe; h++){
            for(int l = hoehe - 1; l > h; l--){
                System.out.print(" ");
            }
            for(int s = 0; s < (h*2)+1; s++){
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();
    }

    public static void main(String[] args) {
        new Weihnachtsbaum();
    }
}
