package service.commit;

import domain.Commit;

import java.util.ArrayList;
import java.util.List;

public class GithubCommitSource implements CommitSource {
    public GithubCommitSource() {
        System.out.println("Вызван конструктор класса GithubCommitSource");
    }
    @Override
    public List<Commit> extractCommits() {
        System.out.println("Вызван метод extractCommits класса GithubCommitSource");
        return new ArrayList<>();
    }
}
