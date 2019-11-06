import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner input = new Scanner(System.in);

        try {  System.out.println("Podaj imię");
            String firstName = input.nextLine();
            System.out.println("Podaj nazwisko");
            String lastName = input.nextLine();
            System.out.println("Podaj wiek");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("Podaj pesel");
            String pesel = input.nextLine();
            Person person = new Person(firstName, lastName, age, pesel);
            System.out.println(person);
        } catch (NameUndefinedException | IncorrectAgeException ex) {
            System.err.println(ex.getMessage());
        }
    }
}