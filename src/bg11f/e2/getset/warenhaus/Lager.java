package bg11f.e2.getset.warenhaus;

public class Lager {
    private Ware[] waren;
    private int anzahlWaren = 0;

    public Lager(int maxWaren) {
        this.waren = new Ware[maxWaren];
    }

    public boolean hinzufuegen(Ware w) {
        if(anzahlWaren >= this.waren.length) {
            System.out.println("Lager ist voll.");
            return false;
        }
        waren[anzahlWaren] = w;
        anzahlWaren++;
        return true;
    }

    public String getBestand() {
        String output = "Lager (%s/%s):\n".formatted(anzahlWaren, this.waren.length);
        for(int i = 0; i < this.waren.length; i++) {
            if(this.waren[i] == null) {
                output += "Leer\n";
                continue;
            }
            output += this.waren[i] + "\n";
        }
        return output;
    }
}
