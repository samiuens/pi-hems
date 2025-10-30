package bg12e.q1.oose.vererbung.person;

public class Person {
    protected String name;
    protected String gebDatum;
    protected String adresse;

    public Person(String name, String gebDatum, String adresse) {
        this.name = name;
        this.gebDatum = gebDatum;
        this.adresse = adresse;
    }

    public boolean aendereAdresse(String adresse) {
        if(!this.adresse.equals(adresse)) {
            this.adresse = adresse;
            return true;
        }
        return false;
    }

    public boolean pruefe(String adresse) {
        return this.adresse.equals(adresse);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGebDatum() {
        return gebDatum;
    }

    public void setGebDatum(String gebDatum) {
        this.gebDatum = gebDatum;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
