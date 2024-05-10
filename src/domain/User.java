package domain;

public class User {
    private String firstName;
    private String lastName;
    private String middleName;

    public User(String firstName, String lastName, String middleName) {
        System.out.println("Вызван конструктор класса User");
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFirstName() {
        System.out.println("Вызван метод getFirstName класса User");
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("Вызван метод setFirstName класса User");
        this.firstName = firstName;
    }

    public String getLastName() {
        System.out.println("Вызван метод getLastName класса User");
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("Вызван метод setLastName класса User");
        this.lastName = lastName;
    }

    public String getMiddleName() {
        System.out.println("Вызван метод getMiddleName класса User");
        return middleName;
    }

    public void setMiddleName(String middleName) {
        System.out.println("Вызван метод setMiddleName класса User");
        this.middleName = middleName;
    }
}
