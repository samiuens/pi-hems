package bg11f.e2.getset;

import java.util.ArrayList;
import java.util.List;

public class SchuelerAufgabe {
    public class Schueler {
        String vorname;
        String nachname;
        int alter;
        Klasse klasse;

        public Schueler(String vorname, String nachname, int alter, Klasse klasse) {
            this.vorname = vorname;
            this.nachname = nachname;
            this.alter = alter;
            this.klasse = klasse;
            klasse.klassenliste.add(this);
        }
    }

    public class Klasse {
        public enum SCHULEN {
            HEMS,
            MBS,
            FLS
        }
        SCHULEN schule;

        public enum SCHULFORMEN {
            BG,
            FOS
        }
        SCHULFORMEN schulform;

        int stufe;
        String klasse;
        List<Schueler> klassenliste;

        public Klasse(SCHULEN schule, SCHULFORMEN schulform, int stufe, String klasse) {
            this.schule = schule;
            this.schulform = schulform;
            this.stufe = stufe;
            this.klasse = klasse;
            this.klassenliste = new ArrayList<>();
        }

        String getKlassenName() {
            return this.schulform.toString() + this.stufe + this.klasse;
        }

        String getKlassenListe() {
            String liste = "";
            for(Schueler schueler : klassenliste) {
                liste += "%s, %s (%s)\n".formatted(schueler.nachname, schueler.vorname, schueler.alter);
            }
            return liste;
        }
    }

    public SchuelerAufgabe() {
        Klasse[] klasse = {
                new Klasse(Klasse.SCHULEN.HEMS, Klasse.SCHULFORMEN.BG, 11, "f"),
                new Klasse(Klasse.SCHULEN.HEMS, Klasse.SCHULFORMEN.BG, 11, "d")
        };
        Schueler[] schueler = {
                new Schueler("Sami Arda", "Ünsay", 17, klasse[0]),
                new Schueler("Ilyas", "El Ayri", 17, klasse[0]),
                new Schueler("Yassine", "Khellafi", 17, klasse[0]),
                new Schueler("Hans", "Müller", 16, klasse[1]),
        };
        for(int i = 0; i < klasse.length; i++) {
            System.out.println(klasse[i].getKlassenName() + ": ");
            System.out.println(klasse[i].getKlassenListe());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new SchuelerAufgabe();
    }
}
