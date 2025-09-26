package bg11f.e1.zeichenkette;

import java.util.Scanner;

public class Palindrom {
    public Palindrom() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        input = input.toLowerCase();
        input = input.replace(" ", "");
        String backwards = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            backwards += input.charAt(i);
        }
        boolean palindrom = input.equals(backwards);
        System.out.println(palindrom);
    }

    public static void main(String[] args) {
        new Palindrom();
    }
}
