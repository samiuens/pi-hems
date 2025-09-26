package bg11f.e1.felder.eindimensional;

import java.util.Random;

public class PasswortGenerator {
    public PasswortGenerator() {
        int laenge = 16;
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] numbers = "0123456789".toCharArray();
        char[] specials = "!§$%&/()=?{}".toCharArray();

        String password = "";
        for(int i = 0; i < laenge; i++) {
            Random rndm = new Random();
            int option = rndm.nextInt(4);
            if(option == 0) {
                password += chars[rndm.nextInt(chars.length)];
            } else if(option == 1) {
                password += CHARS[rndm.nextInt(CHARS.length)];
            } else if(option == 2) {
                password += numbers[rndm.nextInt(numbers.length)];
            } else if(option == 3) {
                password += specials[rndm.nextInt(specials.length)];
            }
        }
        System.out.println("Ihr generiertes Passwort: %s".formatted(password));
    }

    public static void main(String[] args) {
        new PasswortGenerator();
    }
}
