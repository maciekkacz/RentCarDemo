import java.io.*;
import java.util.Scanner;

public class WritingAndReading {


    public Person readFile(String fileName) throws IOException, ClassNotFoundException {
        try(
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            return (Person) ois.readObject();
        }
    }

    public static void writeFile(Person person, String fileName) {
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
    private static Person createCompany() {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("Wprowadź imię:");
            String firstName = scanner.nextLine();
            System.out.println("Wprowadź nazwisko:");
            String lastName = scanner.nextLine();
            System.out.println("Wprowadź PESEL:");
            String pesel = scanner.nextLine();
            System.out.println("Wprowadź :");
            System.out.println("Wprowadź :");



        }
        return person;
    }
}
