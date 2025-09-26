package bg11f.e1.verzweigung;

import java.util.Scanner;

public class Y2KProblemDetektor {
    public Y2KProblemDetektor() {
        Scanner sc = new Scanner(System.in);
        int eingabeGeburtsjahr, eingabeJahr;
        System.out.println("Geben Sie ihr Geburtsjahr ein: ");
        eingabeGeburtsjahr = sc.nextInt();
        System.out.println("Geben Sie das aktuelle Jahr ein: ");
        eingabeJahr = sc.nextInt();
        sc.close();
        String geburtsjahr, aktuellesJahr;

        if(eingabeGeburtsjahr <= 24) {
            if(eingabeGeburtsjahr <= 9) {
                geburtsjahr = "200" + eingabeGeburtsjahr;
            } else {
                geburtsjahr = "20" + eingabeGeburtsjahr;
            }
        } else {
            geburtsjahr = "19" + eingabeGeburtsjahr;
        }

        if(eingabeJahr <= 24) {
            if(eingabeJahr <= 9) {
                aktuellesJahr = "200" + eingabeJahr;
            } else {
                aktuellesJahr = "20" + eingabeJahr;
            }
        } else {
            aktuellesJahr = "19" + eingabeJahr;
        }

        System.out.println(geburtsjahr);
        System.out.println(aktuellesJahr);
        int alter = Integer.parseInt(aktuellesJahr) - Integer.parseInt(geburtsjahr);
        System.out.println("Ihr Alter ist: " + alter);
    }

    public static void main(String[] args) {
        new Y2KProblemDetektor();
    }
}