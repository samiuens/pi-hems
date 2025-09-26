package bg11f.e1.schleifen;

public class SterneMatrix1 {
    public SterneMatrix1() {
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 6; j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new SterneMatrix1();
    }
}
