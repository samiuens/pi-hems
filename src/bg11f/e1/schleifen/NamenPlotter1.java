package bg11f.e1.schleifen;

public class NamenPlotter1 {
    public NamenPlotter1() {
        String name = "sami";
        for(int i = 0; i < 15; i++) {
            System.out.println("(for): " + name + " (" + i + ")");
        }

        int i = 0;
        while(i < 15) {
            System.out.println("(while): " + name + " (" + i + ")");
            i++;
        }
    }
    public static void main(String[] args) {
        new NamenPlotter1();
    }
}
