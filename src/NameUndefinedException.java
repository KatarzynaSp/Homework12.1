class NameUndefinedException extends RuntimeException {
    NameUndefinedException() {
        super("Imię i nazwisko musi być dłuższe niż dwa znaki.");
    }
}