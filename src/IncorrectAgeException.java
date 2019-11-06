public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException() {
        super("Wiek musi być liczbą większą od 1.");
    }
}