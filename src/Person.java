class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        checkPreconditions(firstName, lastName, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void checkPreconditions(String firstName, String lastName, int age) {
        if (firstName == null || lastName == null
                || firstName.length() < 3 || lastName.length() < 3) {
            throw new NameUndefinedException();
        }

        if (age < 1) {
            throw new IncorrectAgeException();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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