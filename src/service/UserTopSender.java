package service;

import domain.User;

import java.util.List;

public interface UserTopSender {
    void send(List<User> users);
}
