package bg11f.e2.dateien;

import java.io.*;

public class DateiLesen {
    public DateiLesen() {
        String fileName = "datei.txt";
        try {
            File file = new File(fileName);
            if(!file.exists()) {
                PrintWriter writer = new PrintWriter(fileName);
                writer.println("This is a automatically generated file!");
                System.out.println("File created: " + fileName);
                writer.close();
                return;
            }
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            System.out.println(bufferedReader.readLine());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new DateiLesen();
    }
}
