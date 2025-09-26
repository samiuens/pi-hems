package bg11f.e2.methoden;

public class Schuelerdaten {
    public Schuelerdaten() {
    }

    public static void main(String[] args) {
        Schuelerdaten s = new Schuelerdaten();
        String[][] liste = {
            {"Mueller Sebastian","19.12.1999","12a","Darmstadt"},
            {"Grimm Marion","01.08.2000","11e","Pfungstadt"},
            {"Adab Mercan","13.10.1999","12a","Dornheim"},
            {"Pelikan Simon","05.04.2001","12b","Darmstadt"},
            {"Malka Sabine","30.08.1999","11e","Pfungstadt"},
            {"Sami Arda","08.01.2008","11f","Reinheim"},
            {"Schneider Thomas","15.03.2005","13c","Frankfurt"}
        };

        liste = s.starteNeuesSchuljahr(liste);
        System.out.println(s.toString(liste));
    }

    public String toString(String[][] liste) {
        if(liste.length == 0) return "Keine Daten vorhanden!";
        String kette = "";
        for(int i = 0; i < liste.length; i++) {
            if(liste[i][0] == null) break;
            kette += "%s ; %s -> %s (%s) \n".formatted(liste[i][0], liste[i][1], liste[i][2], liste[i][3]);
        }
        return kette;
    }

    public String toStringNamensliste(String[][] liste) {
        if(liste.length == 0) return "Keine Daten vorhanden!";
        String namen = "";
        for(int i = 0; i < liste.length; i++) {
            namen += (i + 1) + " " + liste[i][0] + "\n";
        }
        return namen;
    }

    public String[][] findeAlleMitGleichemWohnort(String[][] liste, String wohnort) {
        String[][] filter = new String[liste.length][liste[0].length];
        for(int i = 0; i < liste.length; i++) {
            if(liste[i][3].equals(wohnort)) {
                filter[i] = liste[i].clone();
            }
        }
        return filter;
    }

    public String[][] findeAlleMitGleichemGeburtsjahr(String[][] liste, String geburtsjahr) {
        String[][] filter = new String[liste.length][liste[0].length];
        for(int i = 0; i < liste.length; i++) {
            String subGeburtsjahr = liste[i][1].substring(6, 10);
            if(subGeburtsjahr.equals(geburtsjahr)) {
                filter[i] = liste[i].clone();
            }
        }
        return filter;
    }

    public String[][] findeAlleInGleicherJahrgangsstufe(String[][] liste, String stufe) {
        String[][] filter = new String[liste.length][liste[0].length];
        for(int i = 0; i < liste.length; i++) {
            String subJahrgang = liste[i][2].substring(0, 2);
            if(subJahrgang.equals(stufe)) {
                filter[i] = liste[i].clone();
            }
        }
        return filter;
    }

    public int getAnzahlSchuelerInKlasse(String[][] liste, String klasse) {
        int anzahl = 0;
        for(int i = 0; i < liste.length; i++) {
            for(int j = 0; j < liste[i].length; j++) {
                if(liste[i][j].equals(klasse)) {
                    anzahl++;
                }
            }
        }
        return anzahl;
    }

    public String[][] hinzufuegen(String[][] data, String name, String dob, String klasse, String ort) {
        String[][] liste = new String[data.length + 1][data[0].length];
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                liste[i][j] = data[i][j];
            }
        }
        int index = data.length;
        liste[index][0] = name;
        liste[index][1] = dob;
        liste[index][2] = klasse;
        liste[index][3] = ort;
        return liste;
    }

    public String[][] entfernen(String[][] data, String name) {
        String[][] liste = new String[data.length][data[0].length];
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                if(!data[i][0].equals(name)) liste[i][j] = data[i][j];
            }
        }
        return liste;
    }

    public String[][] starteNeuesSchuljahr(String[][] data) {
        String[][] liste = new String[data.length][data[0].length];
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                int stufe = Integer.parseInt(data[i][2].substring(0, 2));
                int neueStufe = stufe + 1;
                if(neueStufe > 13) break;
                liste[i][j] = data[i][j];
                char klasse = data[i][2].charAt(2);
                liste[i][2] = String.valueOf(neueStufe) + klasse;
            }
        }
        return liste;
    }
}