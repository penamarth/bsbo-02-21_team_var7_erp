package service.commit.extractor;

import service.commit.CommitSource;
import service.commit.GithubCommitSource;

public class GithubCommitExtractor extends CommitExtractor {
    public GithubCommitExtractor() {
        System.out.println("Вызван конструктор класса CommitExtractor");
    }
    @Override
    public CommitSource createCommitSource() {
        System.out.println("Вызван метод createCommitSource класса GithubCommitExtractor");
        return new GithubCommitSource();
    }
}
