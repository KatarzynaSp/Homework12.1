class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws NameUndefinedException, IncorrectAgeException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
        try {
            setFirstName(firstName);
            setLastName(lastName);
            setAge(age);
        } catch (NameUndefinedException | IncorrectAgeException ex) {
            ex.getMessage();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NameUndefinedException {
        this.firstName = firstName;
        if (firstName == null || firstName.length() < 2) {
            throw new NameUndefinedException();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        this.lastName = lastName;
        if (lastName == null || lastName.length() < 2) {
            throw new NameUndefinedException();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IncorrectAgeException {
        this.age = age;
        if (age < 1) {
            throw new IncorrectAgeException();
        }
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