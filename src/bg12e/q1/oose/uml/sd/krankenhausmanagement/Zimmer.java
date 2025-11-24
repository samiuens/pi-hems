package bg12e.q1.oose.uml.sd.krankenhausmanagement;

import java.util.LinkedList;
import java.util.List;

public class Zimmer {
    private int zimmerNummer;
    private int kapazitaet;
    private List<Patient> patienten;

    public Zimmer(int zimmerNummer, int kapazitaet) {
        this.zimmerNummer = zimmerNummer;
        this.kapazitaet = kapazitaet;
        this.patienten = new LinkedList<>();
    }

    private boolean istVoll() {
        return this.patienten.size() >= this.kapazitaet;
    }

    public boolean belegen(Patient patient) {
        return this.patienten.add(patient);
    }

    public void entlassen(Patient patient) {
        this.patienten.remove(patient);
    }

    // Getter- und Setter-Methoden
    public int getZimmerNummer() {
        return zimmerNummer;
    }

    public void setZimmerNummer(int zimmerNummer) {
        this.zimmerNummer = zimmerNummer;
    }

    public int getKapazitaet() {
        return kapazitaet;
    }

    public void setKapazitaet(int kapazitaet) {
        this.kapazitaet = kapazitaet;
    }

    public List<Patient> getPatienten() {
        return patienten;
    }

    public void setPatienten(List<Patient> patienten) {
        this.patienten = patienten;
    }
}
