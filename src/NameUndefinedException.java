class NameUndefinedException extends Exception {
    NameUndefinedException() {
        super("Imię i nazwisko nie może mieć mniej niż 2 znaki.");
    }
}