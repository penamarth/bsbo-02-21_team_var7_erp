package org.bsbo.service.impl;

import org.bsbo.dao.ReportDao;
import org.bsbo.dao.TaskDao;
import org.bsbo.dto.ProjectDto;
import org.bsbo.service.ProjectManageService;

public class ReportManageServiceImpl implements ProjectManageService {
    private final TaskDao taskDao;
    private final ReportDao reportDao;
    public ReportManageServiceImpl(TaskDao taskDao, ReportDao reportDao) {
        this.taskDao = taskDao;
        this.reportDao = reportDao;
    }
    @Override
    public ProjectDto createOrUpdateProject(ProjectDto projectDto) {
        return null;
    }
}
