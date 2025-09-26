package bg11f.e2.getset.bankkonto;

import java.util.ArrayList;
import java.util.Random;

public class Konto {
        private final long kontonummer;
        private double kontostand;
        // Persönliche Daten
        private String vorname;
        private String nachname;
        private String adresse;
        private String telefonnummer;

        public Konto(String vorname, String nachname, String adresse, String telefonnummer) {
            this.kontonummer = generateKontonummer();
            this.kontostand = 0.0;
            // Persönliche Daten
            this.vorname = vorname;
            this.nachname = nachname;
            this.adresse = adresse;
            this.telefonnummer = telefonnummer;
        }

        public long generateKontonummer() {
            Random random = new Random();
            return (long) (random.nextDouble() * 100000000000L);
        }

        public long getKontonummer() {
            return this.kontonummer;
        }

        public double getKontostand() {
            return this.kontostand;
        }

        public void einzahlen(double betrag) {
            if(betrag > 0) this.kontostand += betrag;
        }

        public double auszahlen(double betrag) {
            if(betrag > this.kontostand) {
                double max = betrag - this.kontostand;
                this.kontostand -= max;
                return max;
            }
            this.kontostand -= betrag;
            return betrag;
        }

        public String getVorname() {
            return this.vorname;
        }

        public void setVorname(String vorname) {
            this.vorname = vorname;
        }

        public String getNachname() {
            return this.nachname;
        }

        public void setNachname(String nachname) {
            this.nachname = nachname;
        }

        public String getFullname() {
            return "%s %s".formatted(this.vorname, this.nachname);
        }

        public String getAdresse() {
            return this.adresse;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
        }

        public String getTelefonnummer() {
            return this.telefonnummer;
        }

        public void setTelefonnummer(String telefonnummer) {
            this.telefonnummer = telefonnummer;
        }

        public String getKontoauszug() {
            String auszug = "";
            auszug = "%s (%s)\naktueller Kontostand: %s Euro".formatted(this.getFullname(), this.kontonummer, this.kontostand);
            return auszug;
        }

        public String getDatenauszug() {
            String auszug = "Nachname: %s  |  Vorname: %s\nAdresse: %s\nTelefonnummer: %s".formatted(this.nachname, this.vorname, this.adresse, this.telefonnummer);
            return auszug;
        }
}
