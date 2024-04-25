package org.bsbo.dao;

import org.bsbo.domain.Project;
import org.bsbo.domain.Report;
import org.bsbo.domain.Task;
import org.bsbo.domain.User;

import java.util.List;

public interface ProjectDao {
    Project save(Project project);
    Project getProjectStatistics(long id);
    List<Task> getAllUncompletedTasks(Project project);
    List<Report> getUserMessages(long userId);
    List<Report> getAllMessages();
    boolean isProjectWorker(User user, Project project);
    Project findById(long id);
}
