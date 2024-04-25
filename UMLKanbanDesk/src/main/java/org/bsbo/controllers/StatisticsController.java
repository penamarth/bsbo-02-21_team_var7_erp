package org.bsbo.controllers;

import org.bsbo.dao.ProjectDao;
import org.bsbo.dto.Statistics;

public class StatisticsController {
    private final ProjectDao projectDao;
    public StatisticsController(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }

    public Statistics getStatistics() {
        return new Statistics();
    }
}
