package bg11f.e1.daten;

public class Variablen {
    public Variablen(int age, double income, char gender, boolean isPresident, String name) {
        System.out.println("Alter: " + age);
        System.out.println("Einkommen: " + income);
        System.out.println("Geschlecht (m/w): " + gender);
        System.out.println("Ist Präsident? " + isPresident);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        int age = 16;
        double income = 10000;
        char gender = 'M';
        boolean isPresident = true;
        String name = "Sami Arda";

        new Variablen(age, income, gender, isPresident, name);
    }
}
