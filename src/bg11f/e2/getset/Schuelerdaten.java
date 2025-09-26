package bg11f.e2.getset;

public class Schuelerdaten {
    public class Schueler {
        public String name;
        public String geburtsdatum;
        public Klasse klasse;
        public String wohnort;

        public Schueler(String name, String geburtsdatum, Klasse klasse, String wohnort) {
            this.name = name;
            this.geburtsdatum = geburtsdatum;
            this.klasse = klasse;
            this.wohnort = wohnort;
        }
    }

    public class Klasse {
        public String schulform;
        public int stufe;
        public char klasse;

        public Klasse(String schulform, int stufe, char klasse) {
            this.schulform = schulform;
            this.stufe = stufe;
            this.klasse = klasse;
        }

        public String getKlassenName() {
            return schulform + stufe + klasse;
        }
    }

    public Schuelerdaten() {
        int anzahlKlassen = 3;
        Klasse[] klassen = new Klasse[anzahlKlassen];
        klassen[0] = erstelleKlasse("BG", 11, 'F');
        klassen[1] = erstelleKlasse("FOS", 12, 'A');
        klassen[2] = erstelleKlasse("BS", 13, 'B');

        int anzahlSchueler = 2;
        Schueler[] schueler = new Schueler[anzahlSchueler];

        schueler[0] = erstelleSchueler("Sami Arda", "08.01.2008", klassen[0], "Reinheim");
        schueler[1] = erstelleSchueler("Yassine Khellafi", "01.01.2008", klassen[0], "Darmstadt");

        System.out.println(toStringKlassenListe(klassen));
        System.out.println(toStringNamensliste(schueler));
    }

    public static void main(String[] args) {
        Schuelerdaten s = new Schuelerdaten();
    }

    public Klasse erstelleKlasse(String schulform, int stufe, char klasse) {
        return new Klasse(schulform, stufe, klasse);
    }

    public Schueler erstelleSchueler(String name, String geburtsdatum, Klasse klasse, String wohnort) {
        return new Schueler(name, geburtsdatum, klasse, wohnort);
    }

    public Schueler[] entferneSchuelerMitName(Schueler[] liste, String name) {
        Schueler[] schueler = new Schueler[liste.length];
        for(int i = 0; i < liste.length; i++) {
            if(liste[i].name != name) schueler[i] = liste[i];
        }
        return schueler;
    }

    public String toStringNamensliste(Schueler[] liste) {
        String schueler = "";
        for(int i = 0; i < liste.length; i++) {
            if(liste[i] == null) break;
            schueler += (i + 1) + ". " + liste[i].name + " ; " + liste[i].geburtsdatum + " -> " + liste[i].klasse.getKlassenName() + " (" + liste[i].wohnort + ")\n";
        }
        return schueler;
    }

    public String toStringKlassenListe(Klasse[] liste) {
        String klassen = "";
        for(int i = 0; i < liste.length; i++) {
            if(liste[i] == null) break;
            klassen += (i + 1) + ". " + liste[i].getKlassenName() + "\n";
        }
        return klassen;
    }


    public Schueler[] findeAlleMitGleichemWohnort(Schueler[] liste, String wohnort) {
        Schueler[] schueler = new Schueler[liste.length];
        for (int i = 0; i < liste.length; i++) {
            if(schueler[i].wohnort.equals(wohnort)) schueler[i] = liste[i];
        }
        return schueler;
    }

    public Schueler[] findeAlleMitGleichemGeburtsjahr(Schueler[] liste, String geburtsjahr) {
        Schueler[] schueler = new Schueler[liste.length];
        for (int i = 0; i < liste.length; i++) {
            if(liste[i].geburtsdatum.substring(6, 10).equals(geburtsjahr)) schueler[i] = liste[i];
        }
        return schueler;
    }

    public Schueler[] findeAlleInGleicherJahrgangsstufe(Schueler[] liste, int stufe) {
        Schueler[] schueler = new Schueler[liste.length];
        for (int i = 0; i < liste.length; i++) {
            if(liste[i].klasse.stufe == stufe) schueler[i] = liste[i];
        }
        return schueler;
    }

    public int getAnzahlSchuelerInKlasse(Schueler[] liste, Klasse klasse) {
        int anzahlSchuelerInKlasse = 0;
        for (int i = 0; i < liste.length; i++) {
            if(liste[i].klasse == klasse) anzahlSchuelerInKlasse++;
        }
        return anzahlSchuelerInKlasse;
    }

    public Klasse[] starteNeuesSchuljahr(Klasse[] liste) {
        Klasse[] klassen = new Klasse[liste.length];
        for(int i = 0; i < liste.length; i++) {
            int naechsteStufe = liste[i].stufe + 1;
            if(naechsteStufe <= 13) {
                klassen[i] = liste[i];
            }
        }
        return klassen;
    }
}
