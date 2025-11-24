package bg12e.q1.oose.uml.sd.bibliothek;

public class Leser {
    private static int leserZaehler = 1;
    private int leserNr;
    private String name;
    private static int maxAusleihen = 3;
    private Exemplar[] meineExemplare;
    private int anzahlAusleihen;

    public Leser(String name) {
        this.leserNr = leserZaehler;
        leserZaehler++;
        this.name = name;
        this.meineExemplare = new Exemplar[maxAusleihen];
        this.anzahlAusleihen = 0;
    }

    public int hatAusleihen() {
        return this.anzahlAusleihen;
    }

    public boolean hinzufuegen(Exemplar e) {
        if(hatAusleihen() >= maxAusleihen) return false;
        for(int i = 0; i < meineExemplare.length; i++) {
            if(meineExemplare[i] == null) {
                meineExemplare[i] = e;
                this.anzahlAusleihen++;
                return true;
            }
        }
        return false;
    }

    public boolean entfernen(Exemplar e) {
        for(int i = 0; i < meineExemplare.length; i++) {
            if (meineExemplare[i] != null && meineExemplare[i].equals(e)) {
                meineExemplare[i] = null;
                this.anzahlAusleihen--;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: %s, Name: %s -> ausgeliehene Exemplare: %s".formatted(this.leserNr, this.name, this.anzahlAusleihen)).append("\n");
        for(Exemplar exemplar : meineExemplare) {
            if(exemplar != null) sb.append("\t").append(exemplar.toString()).append("\n");
        }
        return sb.toString();
    }

    // Getter- und Setter-Methoden

    public int getLeserZaehler() {
        return leserZaehler;
    }

    public int getLeserNr() {
        return leserNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Exemplar[] getMeineExemplare() {
        return meineExemplare;
    }

    // Static
    public static int getMaxAusleihen() {
        return maxAusleihen;
    }

    public static void setMaxAusleihen(int maxAusleihen) {
        Leser.maxAusleihen = maxAusleihen;
    }
}
