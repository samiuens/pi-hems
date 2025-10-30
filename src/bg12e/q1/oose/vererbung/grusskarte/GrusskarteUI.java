package bg12e.q1.oose.vererbung.grusskarte;

import java.util.Scanner;

public class GrusskarteUI {
    public static void main(String[] args) {
        Geburtstag g = new Geburtstag("Greg", 18);
        System.out.println(g.gruesse());

        Valentin v = new Valentin("Debby", 3);
        System.out.println(v.gruesse());

        Feiertag f = new Feiertag("Elroy");
        System.out.println(f.gruesse());
    }
}
