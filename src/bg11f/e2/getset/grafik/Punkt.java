package bg11f.e2.getset.grafik;

public class Punkt {
    private double x, y;
    private Farbe farbe;

    public Punkt(double x, double y, Farbe farbe) {
        this.x = x;
        this.y = y;
        this.farbe = farbe;
    }

    public Punkt(double x, double y, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.farbe = new Farbe(r, g, b);
    }

    // X
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    // Y
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punkt (%s, %s), Farbe: %s".formatted(x, y, farbe);
    }
}
