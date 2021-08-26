import java.io.*;
import java.util.Scanner;

public class WritingAndReading  {



    public Person readFile(String fileName) throws IOException, ClassNotFoundException {
        try(
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return (Person) ois.readObject();
        }
    }

    public void writeFile(Person person, String fileName) {
        try(
                FileOutputStream fis = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fis);
        ) {
            oos.writeObject(person);
            System.out.println("Zapisano dane do pliku");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }

    }
    public Person createPerson() {
        Person person = new Person();

        Scanner scanner = new Scanner(System.in);
        {

            System.out.println("Wprowadź imię: ");
            String firstName = scanner.nextLine();
            System.out.println("Wprowadź nazwisko: ");
            String lastName = scanner.nextLine();
            System.out.println("Wprowadź PESEL: ");
            String pesel = scanner.nextLine();
            System.out.println("Wprowadź ulice: ");
            String street = scanner.nextLine();
            System.out.println("Wprowadź numer budynku: ");
            String buildingNumber = scanner.nextLine();
            System.out.println("Wprowadź numer mieszkania: ");
            String apartmentNumber = scanner.nextLine();
            System.out.println("Wprowadź kod pocztowy: ");
            int zipCod = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Wprowadź miasto: ");
            String city = scanner.nextLine();
            new Person(firstName, lastName, pesel, street, buildingNumber, apartmentNumber, zipCod, city);


        }
        return person;
    }
}
