package bg11f.e2.getset.schueler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchuelerUi {
    public SchuelerUi() {
        enum ACTIONS {
            ERSTELLEN,
        }

        List<Schueler> schueler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new SchuelerUi();
    }
}
