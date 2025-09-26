package bg11f.e2.methoden;

public class Statistiken {
    public static void main(String[] args) {
        Statistiken s = new Statistiken();
    }

    public double berechneDurchschnitt(int[] zahlen) {
        double sum = 0;
        for(int i = 0; i < zahlen.length; i++) {
            sum += zahlen[i];
        }
        return sum / zahlen.length;
    }

    public double berechneDurchschnitt(double[] zahlen, boolean gerundet) {
        double sum = 0;
        for(int i = 0; i < zahlen.length; i++) {
            sum += zahlen[i];
        }
        if(gerundet) return Math.round(sum / zahlen.length);
        return sum / zahlen.length;
    }

    public double berechneDurchschnitt(int[] zahlen, int min, int max) {
        double sum = 0;
        int j = 0;
        for(int i = 0; i < zahlen.length; i++) {
            if(zahlen[i] >= min && zahlen[i] <= max) {
                sum += zahlen[i];
                j++;
            }
        }
        return sum / j;
    }
}
