public class IncorrectAgeException extends Exception {
    public IncorrectAgeException(){
        super("Wiek musi być liczbą większą od 1.");
    }
}