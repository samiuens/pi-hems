package bg11f.e1.felder.zweidimensional;

public class Computerspiel1 {
    public Computerspiel1() {
        char[][] spielfeld = new char[10][10];
        for(int i = 0; i < spielfeld.length; i++) {
            for(int j = 0; j < spielfeld.length; j++) {
                spielfeld[i][j] = 'x';
            }
        }
        
        for(int i = 0; i < spielfeld.length; i++) {
            spielfeld[i][0] = 'o';
            spielfeld[i][5] = 'o';
            spielfeld[i][9] = 'o';
        }
        
        System.out.print("\t  ");
        for(int q = 0; q < spielfeld.length; q++) {
            System.out.print(q + 1 + " ");
        }
        System.out.println();
        for(int col = 0; col < spielfeld.length; col++) {
            System.out.print(col + 1 + "\t| ");
            for(int row = 0; row < spielfeld.length; row++) {
                System.out.print(spielfeld[col][row] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Computerspiel1();
    }
}
