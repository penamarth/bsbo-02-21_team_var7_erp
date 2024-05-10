package service;

import domain.User;

import java.util.List;

public class EmailUserTopSenderAdapter implements UserTopSender {
    private final EmailService emailService;
    public EmailUserTopSenderAdapter(EmailService emailService) {
        System.out.println("Вызван конструктор класса EmailUserTopSenderAdapter");
        this.emailService = emailService;
    }
    @Override
    public void send(List<User> users) {
        System.out.println("Вызван метод send класса EmailUserTopSenderAdapter");
        emailService.sendMessage("users converted to text", "email");
    }
}
