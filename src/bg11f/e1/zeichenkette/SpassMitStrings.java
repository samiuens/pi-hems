package bg11f.e1.zeichenkette;

import java.time.LocalTime;
import java.util.Scanner;

public class SpassMitStrings {
    public SpassMitStrings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein optionales Datum: ");
        String datumFilter = sc.nextLine();
        System.out.println();
        sc.close();

        String messdaten = "27.04.2023;09:00;21.8;43.0;1007\r\n" +
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

        int dataCount = 0;
        double dTemperatur = 0.0;
        double dFeuchtigkeit = 0.0;
        double dLuftdruck = 0.0;

        String[] daten = messdaten.split("\r\n");
        for (int i = 0; i < daten.length; i++) {
            String[] dataset = daten[i].split(";");
            for (int o = 0; o < dataset.length; o++) {
                String datum = dataset[0];
                if (datumFilter != "" && !datum.equals(datumFilter))
                    break;
                LocalTime uhrzeit = LocalTime.parse(dataset[1]);
                double temp = Double.parseDouble(dataset[2]);
                double feuchtigkeit = Double.parseDouble(dataset[3]);
                int luftdruck = Integer.parseInt(dataset[4]);

                boolean tropenNacht = false;
                double durchschnittNacht = 0.0;
                int nachtCount = 0;
                if (uhrzeit.getHour() > 6 && uhrzeit.getHour() < 18) {
                    durchschnittNacht += temp;
                    nachtCount++;
                }
                durchschnittNacht  = durchschnittNacht / nachtCount;
                if (durchschnittNacht >= 20)
                    tropenNacht = true;

                dTemperatur += temp;
                dFeuchtigkeit += feuchtigkeit;
                dLuftdruck += luftdruck;

                System.out.println("%s um %s Uhr: %s °C, %s, %s hPa | Tropennacht?: %s".formatted(datum, uhrzeit.toString(),
                        "" + temp, "" + feuchtigkeit, "" + luftdruck, tropenNacht));
                dataCount++;
            }
        }

        dTemperatur = dTemperatur / dataCount;
        dFeuchtigkeit = dFeuchtigkeit / dataCount;
        dLuftdruck = dLuftdruck / dataCount;
        System.out.println("\nDurchschnittswerte:\n\nd. Temperatur: %s\nd. Feuchtigkeit: %s\nd. Luftdruck: %s"
                .formatted(dTemperatur, dFeuchtigkeit, dLuftdruck));
    }

    public static void main(String[] args) {
        new SpassMitStrings();
    }
}