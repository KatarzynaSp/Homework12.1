class IncorrectAgeException extends Exception {
    IncorrectAgeException() {
        super("Wiek musi być liczbą większą od 1.");
    }
}