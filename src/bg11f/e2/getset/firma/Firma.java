package bg11f.e2.getset.firma;

public class Firma {
    private String firmenname;
    private double gesamtumsatz;
    private Werk[] werke;
    private int anzahlWerke;

    public Firma(String firmenname) {
        this.firmenname = firmenname;
        this.werke = new Werk[10];
    }

    // Gesamtumsatz
    public double berechneGesamtumsatz() {
        double umsatz = 0;
        for (Werk werk : werke) {
            if (werk != null) {
                umsatz += werk.berechneGesamtumsatz();
            }
        }
        this.gesamtumsatz = umsatz;
        return gesamtumsatz;
    }

    // Produktion
    public String steuereProduktion(double limit) {
        Werk[] werkeLimit = new Werk[10];
        int j = 0;
        // Iteriere über alle Werke mit dem angegebenen Limit
        for(Werk werk : werke) {
            if (werk != null && werk.berechneGesamtumsatz() > limit) {
                werkeLimit[j] = werk;
                j++;
            }
        }
        String eingestellteStandorte = "";
        for(Werk werk : werkeLimit) {
            if (werk != null) {
                werk.einstellenProduktion();
                eingestellteStandorte += werk.getBezeichung() + ";";
            }
        }
        return eingestellteStandorte;
    }

    // Werk
    public Werk hinzufuegenWerk(String bezeichnung) {
        if (anzahlWerke <= werke.length) {
            Werk werk = new Werk(bezeichnung);
            werke[anzahlWerke] = werk;
            anzahlWerke++;
            return werk;
        } else {
            System.out.println("Maximale Anzahl an Werken erreicht.");
            return null;
        }
    }
    public Werk getWerk(String bezeichnung) {
        for (Werk werk : werke) {
            if (werk != null && werk.getBezeichung().equals(bezeichnung)) {
                return werk;
            }
        }
        return null;
    }
    public Werk[] getWerke() {
        return werke;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Name: %s\n".formatted(firmenname);
        output += "Gesamtumsatz: %s EUR\n".formatted(berechneGesamtumsatz());
        output += "Werke:\n";
        for (int i = 0; i < werke.length; i++) {
            if (werke[i] != null) {
                output += "%s. %s\n".formatted(i + 1, werke[i]);
            }
        }
        return output;
    }
}
