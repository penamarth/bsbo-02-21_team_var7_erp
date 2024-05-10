package service.commit;

import domain.Commit;

import java.util.List;

public interface CommitSource {
    List<Commit> extractCommits();
}
