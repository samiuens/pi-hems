package bg11f.e2.methoden;

public class UeberladenVonMethoden {
    public static void main(String[] args) {
        UeberladenVonMethoden m = new UeberladenVonMethoden();
        double ergebnis = m.berechne(5, 3, OPERATIONEN.PLUS);
        System.out.println(ergebnis);
    }

    enum OPERATIONEN {
        PLUS, MINUS, MULTIPLY, DIVIDE
    }

    public double berechne(int a, int b, OPERATIONEN operator) {
        switch (operator) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                return a / b;
            default:
                return 0;
        }
    }

    public double berechne(double a, double b, OPERATIONEN operator) {
        switch (operator) {
            case PLUS:
                return a + b;
            case MINUS:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                return a / b;
            default:
                return 0;
        }
    }

    public double berechne(int a, int b, int c, OPERATIONEN operator) {
        switch (operator) {
            case PLUS:
                return a + b + c;
            case MINUS:
                return a - b - c;
            case MULTIPLY:
                return a * b * c;
            case DIVIDE:
                return a / b / c;
            default:
                return 0;
        }
    }
}