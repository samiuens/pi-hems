package bg11f.e1.felder.zweidimensional;

public class EinmalEins {
    public EinmalEins() {
        int[][] zahlen = new int[11][10];
        for(int i = 0; i < zahlen.length; i++) {
            for(int j = 0; j < zahlen[i].length; j++) {
                zahlen[i][j] = i  * (j + 1);
            }
        }
        for(int i = 1; i < zahlen.length; i++) {
            System.out.print(i + ". Reihe: ");
            for(int j = 0; j < zahlen[i].length; j++) {
                String seperator = ",";
                if(j == zahlen[i].length - 1) seperator = "";
                System.out.print(zahlen[i][j] + seperator + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new EinmalEins();
    }
}