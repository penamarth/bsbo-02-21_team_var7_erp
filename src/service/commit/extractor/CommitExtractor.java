package service.commit.extractor;

import service.commit.CommitSource;
import domain.Commit;

import java.util.List;

public abstract class CommitExtractor {
    public CommitExtractor() {
        System.out.println("Вызван конструктор класса CommitExtractor");
    }
    public List<Commit> extractCommits() {
        System.out.println("Вызван метод extractCommits класса CommitExtractor");
        CommitSource commitSource = createCommitSource();
        return commitSource.extractCommits();
    }
    abstract public CommitSource createCommitSource();
}
