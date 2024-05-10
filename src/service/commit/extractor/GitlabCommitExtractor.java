package service.commit.extractor;

import service.commit.CommitSource;
import service.commit.GitlabCommitSource;

public class GitlabCommitExtractor extends CommitExtractor {
    public GitlabCommitExtractor() {
        System.out.println("Вызван конструктор класса CommitExtractor");
    }
    @Override
    public CommitSource createCommitSource() {
        System.out.println("Вызван метод createCommitSource класса GitlabCommitExtractor");
        return new GitlabCommitSource();
    }
}
