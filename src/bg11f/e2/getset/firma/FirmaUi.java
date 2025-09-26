package bg11f.e2.getset.firma;

public class FirmaUi {
    public static void main(String[] args) {
        Firma firma = new Firma("Sabr GMBH");
        firma.hinzufuegenWerk("Stuttgart").erstelleProdukt("Bier", 1.99, 1000);
        firma.hinzufuegenWerk("Amsterdam").erstelleProdukt("Gras", 99, 1000);
        System.out.println(firma);
    }
}
