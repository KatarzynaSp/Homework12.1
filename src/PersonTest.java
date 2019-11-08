import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner input = new Scanner(System.in);
        Person person = new Person("imię", "nazwsko", 1, "pesel");
        System.out.println("Podaj imię");
        person.setFirstName(input.nextLine());
        System.out.println("Podaj nazwisko");
        person.setLastName(input.nextLine());
        System.out.println("Podaj wiek");
        person.setAge(input.nextInt());
        input.nextLine();
        System.out.println("Podaj pesel");
        person.setPesel(input.nextLine());
        System.out.println(person);
    }
}