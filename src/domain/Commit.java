package domain;

import java.time.LocalDateTime;

public class Commit {
    private LocalDateTime localDateTime;
    private String userName;
    private String reducedHash;

    public Commit(LocalDateTime localDateTime, String userName, String reducedHash) {
        System.out.println("Вызван конструктор класса Commit");
        this.localDateTime = localDateTime;
        this.userName = userName;
        this.reducedHash = reducedHash;
    }

    public LocalDateTime getLocalDateTime() {
        System.out.println("Вызван метод getLocalDateTime класса Commit");
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        System.out.println("Вызван метод setLocalDateTime класса Commit");
        this.localDateTime = localDateTime;
    }

    public String getUserName() {
        System.out.println("Вызван метод getUserName класса Commit");
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("Вызван метод setUserName класса Commit");
        this.userName = userName;
    }

    public String getReducedHash() {
        System.out.println("Вызван метод getReducedHash класса Commit");
        return reducedHash;
    }

    public void setReducedHash(String reducedHash) {
        System.out.println("Вызван метод setReducedHash класса Commit");
        this.reducedHash = reducedHash;
    }
}
