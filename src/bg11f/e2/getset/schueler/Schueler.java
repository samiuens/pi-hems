package bg11f.e2.getset.schueler;

public class Schueler {
    private String name;
    private int schuelerId;
    private String dob;

    public Schueler(String name, int schuelerId, String dob) {
        this.name = name;
        this.schuelerId = schuelerId;
        this.dob = dob;
    }

    // Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Schueler-ID
    public int getSchuelerId() {
        return schuelerId;
    }
    public void setSchuelerId(int schuelerId) {
        this.schuelerId = schuelerId;
    }

    // Geburtsdatum
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String toString() {
        return "%s (%s) -> %s".formatted(name, schuelerId, dob);
    }
}
