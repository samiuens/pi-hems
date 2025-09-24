package bg12e.q1.oose.praktikum.v1;

public class PraktikumUI {
    public static void main(String[] args) {
        Praktikum p1 = new Praktikum("UNIX-Praktikum");
        Praktikum p2 = new Praktikum("ARCH-Praktikum");

        Student s1 = new Student("Max Mustermann", 3.0, 4);
        Student s2 = new Student("Schnorrenberger", 0.8, 5);
        Student s3 = new Student("Ilyas El Ayri", 4.0, 3);
        Student s4 = new Student("Test", 4.0, 1);

        Lehrkraft l1 = new Lehrkraft("Herr Mang", "PI & ET", true);
        Lehrkraft l2 = new Lehrkraft("Herr Gast", "PI & IT", false);
        Lehrkraft l3 = new Lehrkraft("Herr Enders", "Deutsch & Geschichte", false);

        // Lehrkräfte hinzufügen
        p1.hinzufuegen(l1);
        p1.hinzufuegen(l2);
        p1.hinzufuegen(l3);
        // Schüler hinzufügen
        p1.hinzufuegen(s1);
        p1.hinzufuegen(s2);
        p1.hinzufuegen(s3);

        // Lehrkräfte hinzufügen
        p2.hinzufuegen(l1);
        p2.hinzufuegen(l2);
        p2.hinzufuegen(l3);
        // Schüler hinzufügen
        p2.hinzufuegen(s1);
        p2.hinzufuegen(s2);
        p2.hinzufuegen(s3);

        System.out.println(p1);
        //System.out.println(p1.filter(3.0, 4));
        //System.out.println(p1.sortieren());
    }
}
