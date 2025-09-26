package bg11f.e1.zeichenkette;

import java.util.Scanner;

public class SpassMitStrings2 {
    public SpassMitStrings2() {
        String rawMessdaten = "27.04.2023;09:00;21.8;43.0;1007\r\n" +
                "27.04.2023;12:00;15.3;35.9;1003\r\n" +
                "27.04.2023;15:00;24.7;33.4;1019\r\n" +
                "27.04.2023;18:00;16.9;43.0;1017\r\n" +
                "27.04.2023;21:00;21.7;47.1;1015\r\n" +
                "28.04.2023;00:00;21.2;36.1;1019\r\n" +
                "28.04.2023;09:00;19.9;34.6;1020\r\n" +
                "28.04.2023;12:00;22.4;48.2;1001\r\n" +
                "28.04.2023;15:00;20.0;36.9;1020\r\n" +
                "28.04.2023;18:00;22.9;40.7;1013\r\n" +
                "28.04.2023;21:00;19.5;30.3;1004\r\n" +
                "29.04.2023;00:00;18.9;46.1;1005\r\n" +
                "29.04.2023;09:00;21.0;43.8;1001\r\n" +
                "29.04.2023;12:00;20.8;48.6;1017\r\n" +
                "29.04.2023;15:00;21.4;41.9;1014\r\n" +
                "29.04.2023;18:00;24.6;43.0;1016\r\n" +
                "29.04.2023;21:00;18.8;32.6;1017\r\n" +
                "30.04.2023;00:00;21.5;36.0;1003\r\n" +
                "30.04.2023;09:00;18.3;31.4;1007\r\n" +
                "30.04.2023;12:00;15.8;35.0;1008\r\n" +
                "30.04.2023;15:00;18.1;44.8;1015\r\n" +
                "01.05.2023;00:00;21.8;43.0;1007\r\n" +
                "01.05.2023;03:00;15.3;35.9;1003\r\n" +
                "01.05.2023;06:00;24.7;33.4;1019\r\n" +
                "01.05.2023;09:00;16.9;43.0;1017\r\n" +
                "01.05.2023;12:00;21.7;47.1;1015\r\n" +
                "01.05.2023;15:00;21.2;36.1;1019\r\n" +
                "01.05.2023;18:00;19.9;34.6;1020\r\n" +
                "01.05.2023;21:00;22.4;48.2;1001\r\n" +
                "02.05.2023;00:00;20.0;36.9;1020\r\n" +
                "02.05.2023;03:00;22.9;40.7;1013\r\n" +
                "02.05.2023;06:00;19.5;30.3;1004\r\n" +
                "02.05.2023;09:00;18.9;46.1;1005\r\n" +
                "02.05.2023;12:00;21.0;43.8;1001\r\n" +
                "02.05.2023;15:00;20.8;48.6;1017\r\n" +
                "02.05.2023;18:00;21.4;41.9;1014\r\n" +
                "02.05.2023;21:00;24.6;43.0;1016\r\n" +
                "03.05.2023;00:00;18.8;32.6;1017\r\n" +
                "03.05.2023;03:00;21.5;36.0;1003\r\n" +
                "03.05.2023;06:00;18.3;31.4;1007\r\n" +
                "03.05.2023;09:00;21.8;43.0;1007\r\n" +
                "03.05.2023;12:00;15.3;35.9;1003\r\n" +
                "03.05.2023;15:00;24.7;33.4;1019\r\n" +
                "03.05.2023;18:00;16.9;43.0;1017\r\n" +
                "03.05.2023;21:00;21.7;47.1;1015\r\n" +
                "04.05.2023;00:00;21.2;36.1;1019\r\n" +
                "04.05.2023;03:00;19.9;34.6;1020\r\n" +
                "04.05.2023;06:00;22.4;48.2;1001\r\n" +
                "04.05.2023;09:00;20.0;36.9;1020\r\n" +
                "04.05.2023;12:00;22.9;40.7;1013\r\n" +
                "04.05.2023;15:00;19.5;30.3;1004\r\n" +
                "04.05.2023;18:00;18.9;46.1;1005\r\n" +
                "04.05.2023;21:00;21.0;43.8;1001\r\n" +
                "05.05.2023;00:00;20.8;48.6;1017\r\n" +
                "05.05.2023;03:00;21.4;41.9;1014\r\n" +
                "05.05.2023;06:00;24.6;43.0;1016\r\n" +
                "05.05.2023;09:00;18.8;32.6;1017\r\n" +
                "05.05.2023;12:00;21.5;36.0;1003\r\n";
        
        String[] messdaten = rawMessdaten.split("\r\n");
        int anzahlDaten = messdaten.length;

        String[] daten = new String[anzahlDaten];
        String[] uhrzeiten = new String[anzahlDaten];
        double[] temperaturen = new double[anzahlDaten];
        double[] feuchtigkeiten = new double[anzahlDaten];
        int[] luftdruecke = new int[anzahlDaten];

        for(int i = 0; i < anzahlDaten; i++) {
            String[] datensatz = messdaten[i].split(";");
            for(int o = 0; o < datensatz.length; o++) {
                daten[i] = datensatz[0];
                uhrzeiten[i] = datensatz[1];
                temperaturen[i] = Double.parseDouble(datensatz[2]);
                feuchtigkeiten[i] = Double.parseDouble(datensatz[3]);
                luftdruecke[i] = Integer.parseInt(datensatz[4]);
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie ein optionales Datum ein, andernfalls lassen sie die Zeile leer: ");
        String datumFilter = sc.nextLine();
        for(int i = 0; i < daten.length; i++) {
            String datum = daten[i];
            if(datumFilter.equals(datum) || datumFilter.equals("")) {
                String uhrzeit = uhrzeiten[i];
                double temperatur = temperaturen[i];
                double feuchtigkeit = feuchtigkeiten[i];
                int luftdruck = luftdruecke[i];
                System.out.println("%s, %s Uhr;\t%s °C | %s%% Luftfeuchtigkeit | %s hPa".formatted(datum, uhrzeit, "" + temperatur, "" + feuchtigkeit, "" + luftdruck));
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        new SpassMitStrings2();
    }
}