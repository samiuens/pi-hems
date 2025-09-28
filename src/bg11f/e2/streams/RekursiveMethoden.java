package bg11f.e2.streams;

import java.math.BigInteger;

public class RekursiveMethoden {
    public int fakultaet(int n) {
        if(n == 1) return 1;
        return n * fakultaet(n - 1);
    }
    public int summe(int n) {
        if(n == 1) return 1;
        return n + summe(n - 1);
    }
    public String rueckwaerts(String s) {
        if(s.length() <= 1) return s;
        return rueckwaerts(s.substring(1)) + s.charAt(0);
    }
    public int ziffernsumme(int n) {
        if(n < 10) return n;
        return ziffernsumme(n / 10) + n % 10;
    }
    public int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n) + fibonacci(n - 1);
    }

    public RekursiveMethoden() {
        /*int a = 5;
        System.out.println("Fakultät von " + a + " -> " + fakultaet(a));

        int b = 5;
        System.out.println("Summe der Zahlen: 1 bis " + b + " -> " + summe(b));

        String c = "Hallo";
        System.out.println(c + " <-> " + rueckwaerts(c));

        int d = 123;
        System.out.println("Zahlensumme von " + d + " -> " + ziffernsumme(d));*/

        int e = 50;
        System.out.println("Fibonaccizahl n " + e + " -> " + fibonacci(e));
    }

    public static void main(String[] args) {
        new RekursiveMethoden();
    }
}
