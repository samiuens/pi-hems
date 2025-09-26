package bg11f.e1.verzweigung.struktogramm;

import java.util.Scanner;

public class VerzweigungStart1 {
    public VerzweigungStart1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl ein: ");
        int zahl = sc.nextInt();
        sc.close();
        if (zahl > 10) {
            System.out.println(">10!");
        } else {
            System.out.println("Not good.");
        }
    }

    public static void main(String[] args) {
        new VerzweigungStart1();
    }
}
