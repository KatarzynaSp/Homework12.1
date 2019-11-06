import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner input = new Scanner(System.in);

        Person person1 = new Person();
        System.out.println("Podaj imię");
        person1.setFirstName(input.nextLine());
        System.out.println("Podaj nazwisko");
        person1.setLastName(input.nextLine());
        System.out.println("Podaj wiek");
        person1.setAge(input.nextInt());
        input.nextLine();
        System.out.println("Podaj pesel");
        person1.setPesel(input.nextLine());
        try {
            person1.getFirstName();
            person1.getLastName();
            person1.getAge();
        } finally {
            System.out.println(person1);
        }
    }
}