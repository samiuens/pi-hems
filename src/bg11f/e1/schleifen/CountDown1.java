package bg11f.e1.schleifen;

public class CountDown1 {
    public CountDown1() {
        for(int i = 10; i >= 1; i--) {
            System.out.println("(for) i: " + i);
        }

        int i = 10;
        while(i >= 1) {
            System.out.println("(while) i: " + i);
            i--;
        }
    }

    public static void main(String[] args) {
        new CountDown1();
    }
}
