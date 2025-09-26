package bg11f.e2.getset;

import java.util.Arrays;

public class IntListe {
    private Integer[] liste;
    private int size;

    public IntListe() {
        liste = new Integer[10];
    }

    public void add(int value) {
        if(size < liste.length) {
            Integer[] oldListe = liste;
            liste = new Integer[liste.length * 2];
            System.arraycopy(oldListe, 0, liste, 0, oldListe.length);
            return;
        }
        liste[size] = value;
        size++;
    }

    public int get(int index) {
        return liste[index];
    }

    public void set(int index, int value) {
        liste[index] = value;
    }

    public int size() {
        return size;
    }

    public void remove() {
        remove(0);
    }

    public void remove(int index) {
        liste[index] = 0;
        for(int i = index; i < liste.length; i++) {
            if(i > index) liste[i - 1] = liste[i];
        }
    }

    public boolean contains(int value) {
        for(int i = 0; i < liste.length; i++) {
            if(liste[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        String s = Arrays.toString(liste);
        System.out.println(s);
    }

    public static void main(String[] args) {
        IntListe liste = new IntListe();
        for(int i = 0; i <= 30; i++) {
            liste.add(i);
            liste.print();
        }
        System.out.println(liste.size());

    }
}
