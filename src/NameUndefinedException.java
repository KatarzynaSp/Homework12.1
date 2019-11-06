class NameUndefinedException extends Exception {
    NameUndefinedException() {
        super("Imię i nazwisko musi być dłuższe niż dwa znaki.");
    }
}