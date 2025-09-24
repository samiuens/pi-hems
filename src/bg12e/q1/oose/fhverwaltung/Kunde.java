package bg12e.q1.oose.fhverwaltung;

import java.util.LinkedList;

public class Kunde {
    private static int autowert;
    private int nr;
    private String name;
    private String vorname;
    private Adresse adresse;
    private LinkedList<Buchung> buchungen;

    public Kunde(String name, String vorname, Adresse adr) {
        autowert++;
        this.nr = autowert;
        this.name = name;
        this.vorname = name;
        this.adresse = adr;
        this.buchungen = new LinkedList<>();
    }

    public void hinzufuegenBuchung(Buchung buchung) {
        buchungen.add(buchung);
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public LinkedList<Buchung> getBuchungen() {
        return buchungen;
    }

    public void setBuchungen(LinkedList<Buchung> buchungen) {
        this.buchungen = buchungen;
    }
}
