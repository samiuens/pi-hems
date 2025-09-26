package bg11f.e2.getset.grafik;

public class Farbe {
    private int r, g, b;

    public Farbe(int r, int g, int b) {
        if(r < 0 || r > 255) {
            throw new IllegalArgumentException("Rot muss zwischen 0 und 255 liegen.");
        }
        if(g < 0 || g > 255) {
            throw new IllegalArgumentException("Grün muss zwischen 0 und 255 liegen.");
        }
        if(b < 0 || b > 255) {
            throw new IllegalArgumentException("Blau muss zwischen 0 und 255 liegen.");
        }

        this.r = r;
        this.g = g;
        this.b = b;
    }

    // Rot
    public int getRed() {
        return r;
    }
    public void setRed(int r) {
        this.r = r;
    }

    // Grün
    public int getGreen() {
        return g;
    }
    public void setGreen(int g) {
        this.g = g;
    }

    // Blau
    public int getBlue() {
        return b;
    }
    public void setBlue(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return ("%s, %s, %s").formatted(r, g, b);
    }
}
