package bg11f.e1.zeichenkette;

public class Quersumme {
    public Quersumme() {
        String zahl = "5555";
        int quersumme = 0;
        for(int i = 0; i < zahl.length(); i++) {
            char z = zahl.charAt(i);
            int wert = Integer.valueOf("" + z);
            quersumme += wert;
        }
        System.out.println(quersumme);
    }

    public static void main(String[] args) {
        new Quersumme();
    }
}
