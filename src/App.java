import event.EndOfSprintEventPublisher;
import service.EmailService;
import service.EmailUserTopSenderAdapter;
import service.ReportService;
import service.ScoreService;
import service.commit.extractor.CommitExtractor;
import service.commit.extractor.GithubCommitExtractor;
import service.commit.extractor.GitlabCommitExtractor;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch;
        do {
            System.out.print("Выберете, откуда забирать коммиты: gitlab или github (1, 2): ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    EndOfSprintEventPublisher endOfSprintEventPublisherForGitlab = new EndOfSprintEventPublisher();
                    CommitExtractor commitExtractorForGitlab = new GitlabCommitExtractor();
                    ScoreService scoreServiceForGitlab = new ScoreService();
                    EmailService emailServiceForGitlab = new EmailService();
                    EmailUserTopSenderAdapter emailUserTopSenderAdapterForGitlab = new EmailUserTopSenderAdapter(emailServiceForGitlab);
                    ReportService reportServiceForGitlab = new ReportService(commitExtractorForGitlab, scoreServiceForGitlab, emailUserTopSenderAdapterForGitlab);
                    endOfSprintEventPublisherForGitlab.subscribe(reportServiceForGitlab);
                    endOfSprintEventPublisherForGitlab.notifySubscribers();
                    break;
                case 2:
                    EndOfSprintEventPublisher endOfSprintEventPublisherForGithub = new EndOfSprintEventPublisher();
                    CommitExtractor commitExtractorForGithub = new GithubCommitExtractor();
                    ScoreService scoreServiceForGithub = new ScoreService();
                    EmailService emailServiceForGithub = new EmailService();
                    EmailUserTopSenderAdapter emailUserTopSenderAdapterForGithub = new EmailUserTopSenderAdapter(emailServiceForGithub);
                    ReportService reportServiceForGithub = new ReportService(commitExtractorForGithub, scoreServiceForGithub, emailUserTopSenderAdapterForGithub);
                    endOfSprintEventPublisherForGithub.subscribe(reportServiceForGithub);
                    endOfSprintEventPublisherForGithub.notifySubscribers();
                    break;
            }
        } while (ch == 1 || ch == 2);
    }
}