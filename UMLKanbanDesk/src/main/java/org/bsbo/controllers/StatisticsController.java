package org.bsbo.controllers;

import org.bsbo.dao.ProjectDao;
import org.bsbo.domain.Project;
import org.bsbo.dto.Statistics;
import org.bsbo.util.ResponseEntity;

public class StatisticsController {
    private final ProjectDao projectDao;
    public StatisticsController(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }
    public ResponseEntity<Statistics> getStatistics(long projectId, long userId) {
        System.out.println("Вызван метод getStatistics класса StatisticsController");
        Project project = projectDao.getProjectStatistics(projectId);
        projectDao.getAllUncompletedTasks(project);
        projectDao.getUserMessages(userId);
        projectDao.getAllMessages();
        return new ResponseEntity<>();
    }
}
