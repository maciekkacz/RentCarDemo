public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    Adress adress;

    public Person(String firstName, String lastName, String pesel, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.adress = adress;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", adress=" + adress +
                '}';
    }
}
