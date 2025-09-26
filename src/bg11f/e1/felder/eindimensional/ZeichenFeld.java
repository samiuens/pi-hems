package bg11f.e1.felder.eindimensional;

public class ZeichenFeld {
    public ZeichenFeld() {
        int amountLetter = 0;
        int amountDigit = 0;

        String[] chars = new String[36];
        for(int c = 0; c <= 25; c++) {
            int letter = c + 65;
            chars[c] = String.valueOf((char) letter);
            amountLetter++;
        }

        for(int n = 0; n <= 9; n++) {
            chars[n + amountLetter] = String.valueOf(n);
            amountDigit++;
        }
        System.out.println("\n");
        for(int i = 0; i < chars.length; i++) {
            System.out.println(i + ".\t-> " + chars[i]);
        }
        System.out.println("Das Array beinhaltet: %s Buchstaben und %s Zahlen!".formatted(amountLetter, amountDigit));
    }

    public static void main(String[] args) {
        new ZeichenFeld();
    }
}
