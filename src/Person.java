class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        checkFirstName(firstName);
        checkLastName(lastName);
        checkAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public Person() {
    }

    private void checkFirstName(String firstName) throws NameUndefinedException {
        if (firstName == null || firstName.length() < 3) {
            throw new NameUndefinedException();
        }
    }

    private void checkLastName(String lastName) throws NameUndefinedException {
        if (lastName == null || lastName.length() < 3) {
            throw new NameUndefinedException();
        }
    }

    private void checkAge(int age) throws IncorrectAgeException {
        if (age < 1) {
            throw new IncorrectAgeException();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        checkFirstName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        checkLastName(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        checkAge(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "imię: " + getFirstName() +
                ", nazwisko: " + getLastName() +
                ", wiek: " + getAge() +
                ", pesel: " + getPesel();
    }
}