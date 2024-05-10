package service.commit;

import domain.Commit;

import java.util.ArrayList;
import java.util.List;

public class GitlabCommitSource implements CommitSource {
    public GitlabCommitSource() {
        System.out.println("Вызван конструктор класса GitlabCommitSource");
    }
    @Override
    public List<Commit> extractCommits() {
        System.out.println("Вызван метод extractCommits класса GitlabCommitSource");
        return new ArrayList<>();
    }
}
