package dat.sem2.randomdanes;

/**
 * The purpose of this class is is to represent contact persons
 * @author kasper
 */
class Person {
    private final String name;
    private final String telefon;

    public Person(String name, String phoneNo) {
        this.name = name;
        this.telefon = phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return telefon;
    }

    @Override
    public String toString() {
        return name + " ph: " + telefon;
    }
    
}
