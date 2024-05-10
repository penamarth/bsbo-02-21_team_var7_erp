package service;

import service.commit.extractor.CommitExtractor;
import domain.Commit;
import domain.User;
import event.Subscriber;

import java.util.List;

public class ReportService implements Subscriber {
    private final CommitExtractor commitExtractor;
    private final ScoreService scoreService;
    private final UserTopSender userTopSender;
    public ReportService(CommitExtractor commitExtractor, ScoreService scoreService, UserTopSender userTopSender) {
        System.out.println("Вызван конструктор класса ReportService");
        this.commitExtractor = commitExtractor;
        this.scoreService = scoreService;
        this.userTopSender = userTopSender;
    }

    @Override
    public void update() {
        System.out.println("Вызван метод update класса ReportService");
        List<Commit> commits = commitExtractor.extractCommits();
        List<User> topUsers = scoreService.getTopUsers(10, commits);
        userTopSender.send(topUsers);
    }
}
