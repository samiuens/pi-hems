package bg11f.e1.schleifen;

import java.util.Scanner;

public class GuthabenEntwicklung {
    public double round(double zahl, int stellen) {
        return (double) ((int)zahl + (Math.round(Math.pow(10,stellen)*(zahl-(int)zahl)))/(Math.pow(10,stellen)));
    }

    public GuthabenEntwicklung() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie die Laufzeit ein: ");
        int jahre = sc.nextInt();
        double[] guthaben = new double[jahre];
        System.out.println("Geben Sie Ihr Startguthaben ein: ");
        guthaben[0] = sc.nextDouble();
        System.out.println("Geben Sie Ihren Zinssatz ein: ");
        double zinsSatz = sc.nextDouble();
        //System.out.println("Geben Sie ihre jährliche Entnahme an: ");
        //double jaehrlicheEntnahme = sc.nextDouble();
        sc.close();

        for(int i = 0; i <= jahre; i++) {
            guthaben[i + 1] = guthaben[i] * (1 + zinsSatz / 100);
            System.out.println(i + ". Jahr: " + round(guthaben[i + 1], 2) + " Euro");
        }
    }

    public static void main(String[] args) {
        new GuthabenEntwicklung();
    }
}
