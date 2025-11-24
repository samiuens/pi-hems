package bg12e.q1.oose.uml.sd.firmenproduktion;

import java.util.LinkedList;

public class FirmaUi {
    private Firma firma;

    public FirmaUi() {
        this.firma = new Firma("ABC");

        Werk w1 = new Werk("Werk 1");
        Produkt p1 = new Produkt("Papier", 1.99);
        p1.setAnzahl(10000);
        w1.setProdukt(p1);

        LinkedList<Werk> werke = new LinkedList<>();
        werke.add(w1);
        firma.setWerke(werke);

        System.out.println(w1.getProdukt().getProduktname() + ": " + w1.getProdukt().getPreis() + "€ x " + w1.getProdukt().getAnzahl() + " = " + (w1.getProdukt().getAnzahl() * w1.getProdukt().getPreis()) + "€");
    }

    public static void main(String[] args) {
        new FirmaUi();
    }
}
