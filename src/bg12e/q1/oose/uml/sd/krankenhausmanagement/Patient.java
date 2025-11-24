package bg12e.q1.oose.uml.sd.krankenhausmanagement;

import java.util.LinkedList;
import java.util.List;

public class Patient {
    private int patientenNr;
    private String name;
    private String geschlecht;
    private String versicherungsart;
    public static int autowert = 1;
    private Abteilung abteilung;
    private Behandlungsplan behandlungsplan;
    private List<Indikation> indikationen;

    public Patient(String name, String geschlecht, String versicherungsart) {
        this.patientenNr = autowert;
        autowert++;
        this.name = name;
        this.geschlecht = geschlecht;
        this.versicherungsart = versicherungsart;
        this.abteilung = null;
        this.behandlungsplan = null;
        this.indikationen = new LinkedList<>();
    }

    public void entferneBehandlungsplan() {
        this.behandlungsplan = null;
    }

    public Indikation indikationMitHoechsterPrioritaet() {
        if(indikationen.isEmpty()) return null;

        Indikation indi = indikationen.getFirst();
        for(Indikation i : indikationen) {
            if(i.getPrioritaet() > indi.getPrioritaet()) {
                indi = i;
            }
        }
        return indi;
    }

    // Getter- und Setter-Methoden
    public int getPatientenNr() {
        return patientenNr;
    }

    public void setPatientenNr(int patientenNr) {
        this.patientenNr = patientenNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getVersicherungsart() {
        return versicherungsart;
    }

    public void setVersicherungsart(String versicherungsart) {
        this.versicherungsart = versicherungsart;
    }

    public static int getAutowert() {
        return autowert;
    }

    public static void setAutowert(int autowert) {
        Patient.autowert = autowert;
    }

    public Abteilung getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(Abteilung abteilung) {
        this.abteilung = abteilung;
    }

    public Behandlungsplan getBehandlungsplan() {
        return behandlungsplan;
    }

    public void setBehandlungsplan(Behandlungsplan behandlungsplan) {
        this.behandlungsplan = behandlungsplan;
    }

    public List<Indikation> getIndikationen() {
        return indikationen;
    }

    public void setIndikationen(List<Indikation> indikationen) {
        this.indikationen = indikationen;
    }
}
