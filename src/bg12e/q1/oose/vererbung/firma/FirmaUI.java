package bg12e.q1.oose.vererbung.firma;

public class FirmaUI {
    public static void main(String[] args) {
        Angesteller a1 = new Angesteller("Max Mustermann", "01.01.2000", 450, false, 1);
        Fuehrungskraft f1 = new Fuehrungskraft("Olaf Scholz", "02.02.2002", 10000, 5000);
        System.out.println(a1);
        System.out.println(f1);
    }
}
