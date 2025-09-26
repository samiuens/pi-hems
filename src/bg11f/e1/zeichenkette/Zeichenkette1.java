package bg11f.e1.zeichenkette;

public class Zeichenkette1 {
    public Zeichenkette1() {
        String s = "HalloBrudi! ";
        //char c = 'a';

        System.out.println(s.length());
        System.out.println(s.charAt(1));
        String s2 = s.substring(5, 10);
        System.out.println(s2);
        System.out.println(s.contains("Hallo"));
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '!') index = i; 
        }
        System.out.println(index);
        String s3 = s.replace("a", "i");
        System.out.println(s3);
    }

    public static void main(String[] args) {
        new Zeichenkette1();
    }
}