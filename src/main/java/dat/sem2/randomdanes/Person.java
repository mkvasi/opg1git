package dat.sem2.randomdanes;

/**
 * The purpose of this class is is to represent contact persons
 *
 * @author kasper
 */
class Person {

    private final String navn;
    private final String telefon;

    public Person(String navn, String telefon) {
        this.navn = navn;
        this.telefon = telefon;
    }

    public String getName() {
        return navn;
    }

    public String getPhoneNo() {
        return telefon;
    }

    @Override
    public String toString() {
        return navn + " ph: " + telefon;
    }
}