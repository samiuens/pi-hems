package bg11f.e1.felder.eindimensional;

public class Lotto {
    public Lotto() {
        int[] zahlen = new int[6];
        
        for (int i = 0; i < zahlen.length; i++) {
            int zufallszahl = 0;
            boolean checkOperation = true;
            while (checkOperation) {
                zufallszahl = (int) (Math.random() * 49) + 1;
                boolean duplikat = false;
                for (int j = 0; j < zahlen.length; j++) {
                    if (zahlen[j] == zufallszahl) duplikat = true;
                }
                if(!duplikat) checkOperation = false;
            }
            zahlen[i] = zufallszahl;
        }

        for (int o = 0; o < zahlen.length; o++) {
            System.out.println("%s. Zahl\t-> %s".formatted(o + 1, zahlen[o]));
        }
    }

    public static void main(String[] args) {
        new Lotto();
    }
}
