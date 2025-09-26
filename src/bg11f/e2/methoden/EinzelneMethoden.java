package bg11f.e2.methoden;

import java.util.Arrays;
import java.util.Scanner;

public class EinzelneMethoden {
    public EinzelneMethoden() {

    }

    public static void main(String[] args) {
        EinzelneMethoden em = new EinzelneMethoden();
        /*
        Scanner sc = new Scanner(System.in);
        int[] array = em.inputsToArray(sc, 3);
        System.out.println(Arrays.toString(array));
        */
        System.out.println(em.getAmountNumbers("Yassine hat 8 Vapes, 6 davon sind tot, 2 weitere funktionieren noch."));
        System.out.println(em.createProgrammTitle("Testprogramm", 3));
        int seconds = 3600;
        int hours = em.convertSecondsToHours(seconds);
        System.out.printf("%s Sekunden = %s Stunden%n", seconds, hours);
        int hours2 = 5;
        int seconds2 = em.convertHoursToSeconds(hours2);
        System.out.printf("%s Stunden = %s Sekunden%n", hours2, seconds2);
        int[] maxArray = { 5, 10, 90, 22, 11 };
        System.out.println(em.getMaxValueOfArray(maxArray));
        System.out.println(em.equals("Hallo.", "Hallo."));
        System.out.println(em.equals("Hallo.", "Tschüss."));
        System.out.println(em.countContains("Zukunft ist uns wichtig.", "un"));
        //sc.close();
    }

    public int[] inputsToArray(Scanner sc, int amount) {
        int[] array = new int[amount];
        for(int i = 0; i < amount; i++) {
            System.out.printf("Geben sie die %s. Zahl ein: %n", i + 1);
            array[i] = sc.nextInt();
        }
        return array;
    }

    public int getAmountNumbers(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) sum++;
        }
        return sum;
    }

    public String createProgrammTitle(String text, int amountStars) {
        StringBuilder title = new StringBuilder("| ");
        title.append("*".repeat(Math.max(0, amountStars)));
        title.append("  ").append(text).append("  ");
        title.append("*".repeat(Math.max(0, amountStars)));
        title.append(" |");
        return title.toString();
    }

    public int convertSecondsToHours(int seconds) {
        return seconds / 3600;
    }

    public int convertHoursToSeconds(int hours) {
        return hours * 3600;
    }

    public int getMaxValueOfArray(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) max = j;
        }
        return max;
    }

    public boolean equals(String s1, String s2) {
        return s1.equals(s2);
    }

    public int countContains(String s1, String s2) {
        int count = 0;
        if(!s1.contains(s2)) return count;
        while(s1.contains(s2)) {
            count++;
            s1 = s1.replaceFirst(s2, "-");
        }
        return count;
    }
}
