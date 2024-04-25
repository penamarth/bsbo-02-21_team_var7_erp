package org.bsbo.service.impl;

import org.bsbo.dao.ProjectDao;
import org.bsbo.domain.Project;
import org.bsbo.domain.User;
import org.bsbo.service.ProjectAccessManagementService;

public class ProjectAccessManagementServiceImpl implements ProjectAccessManagementService {
    private final ProjectDao projectDao;
    public ProjectAccessManagementServiceImpl(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }
    @Override
    public boolean isProjectWorker(User user, Project project) {
        return false;
    }
}
