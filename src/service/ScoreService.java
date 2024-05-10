package service;

import domain.Commit;
import domain.User;

import java.util.ArrayList;
import java.util.List;

public class ScoreService {
    public ScoreService() {
        System.out.println("Вызван конструктор класса ScoreService");
    }
    public List<User> getTopUsers(int topNumber, List<Commit> commits) {
        System.out.println("Вызван метод getTopUsers класса ScoreService");
        return new ArrayList<>();
    }
}
