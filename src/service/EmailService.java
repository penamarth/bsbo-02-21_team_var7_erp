package service;

public class EmailService {
    public EmailService() {
        System.out.println("Вызван конструктор класса EmailService");
    }
    public void sendMessage(String text, String email) {
        System.out.println("Вызван метод sendMessage класса EmailService");
    }
}
