package bg12e.q1.oose.vererbung.person;

public class Berater extends Person {
    private String firma;

    public Berater(String name, String gebDatum, String adresse, String firma) {
        super(name, gebDatum, adresse);
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }
}
