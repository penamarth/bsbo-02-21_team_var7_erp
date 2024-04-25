package org.bsbo.dao.impl;

import org.bsbo.dao.ProjectDao;
import org.bsbo.domain.Project;
import org.bsbo.domain.Report;
import org.bsbo.domain.Task;

import java.util.List;

public class ProjectDaoImpl implements ProjectDao {
    @Override
    public Project save(Project project) {
        return null;
    }
    @Override
    public Project getProjectStatistics(long id) {
        return null;
    }
    @Override
    public List<Task> getAllUncompletedTasks(Project project) {
        return null;
    }
    @Override
    public List<Report> getUserMessages(long userId) {
        return null;
    }
    @Override
    public List<Report> getAllMessages() {
        return null;
    }
}
