package bg12e.q1.oose.dvl.geraete;

public class Geraet {
    private String name;
    private String marke;
    private String seriennummer;

    public Geraet(String name, String marke) {
        this.name = name;
        this.marke = marke;
        this.seriennummer = null;
    }

    public Geraet(String name, String marke, String seriennummer) {
        this.name = name;
        this.marke = marke;
        this.seriennummer = seriennummer;
    }

    @Override
    public String toString() {
        String serienummer = this.seriennummer == null ? "unbekannt" : this.seriennummer;
        return "'%s' (%s) -> Seriennummer: %s".formatted(this.name, this.marke, this.seriennummer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getSeriennummer() {
        return seriennummer;
    }

    public void setSeriennummer(String seriennummer) {
        this.seriennummer = seriennummer;
    }
}
