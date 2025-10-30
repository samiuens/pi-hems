package bg12e.q1.oose.vererbung.firma;

import java.util.LinkedList;

public class Firma {
    private String firmenname;
    private LinkedList<Person> personen;

    public Firma(String firmenname) {
        this.firmenname = firmenname;
        this.personen = new LinkedList<>();
    }

    public String getFirmenname() {
        return this.firmenname;
    }

    public boolean hinzufuegen(Person p) {
        personen.add(p);
        return true;
    }

    public boolean entfernen(Person p) {
        return personen.remove(p);
    }

    public Person suchen(Person p) {
        for(int i = 0; i < personen.size(); i++) {
            Person pSearch = personen.get(i);
            if(pSearch.equals(p)) return pSearch;
        }
        return null;
    }
}
