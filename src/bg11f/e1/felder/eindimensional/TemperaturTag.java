package bg11f.e1.felder.eindimensional;

import java.util.Scanner;

public class TemperaturTag {
    public TemperaturTag() {
        double[] temperaturen = new double[4];
        Scanner sc = new Scanner(System.in);
        
        double summe = 0;
        double arMittelwert = 0;

        for(int i = 0; i < temperaturen.length; i++) {
            System.out.println("Geben Sie die %s. Temperatur des Tages ein: ".formatted(i + 1));
            double input = sc.nextDouble();
            temperaturen[i] = input;
            summe += temperaturen[i];
        }
        sc.close();
        arMittelwert = summe / temperaturen.length;
        
        System.out.println("\nTemperaturen-Überblick:");
        for(int o = 0; o < temperaturen.length; o++) {
            System.out.println("%s. Temperatur\t-> %s °C".formatted(o + 1, temperaturen[o]));
        }
        System.out.println("\nDer arithmetischen Tagesmittelwert liegt bei: %s °C".formatted(arMittelwert));
    }

    public static void main(String[] args) {
        new TemperaturTag();
    }
}
