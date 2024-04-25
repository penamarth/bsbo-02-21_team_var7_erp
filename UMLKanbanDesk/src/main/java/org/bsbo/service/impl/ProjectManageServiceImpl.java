package org.bsbo.service.impl;

import org.bsbo.dao.ProjectDao;
import org.bsbo.dto.ProjectDto;
import org.bsbo.service.ProjectManageService;

public class ProjectManageServiceImpl implements ProjectManageService {
    private final ProjectDao projectDao;
    public ProjectManageServiceImpl(ProjectDao projectDao) {
        this.projectDao = projectDao;
    }
    @Override
    public ProjectDto createOrUpdateProject(ProjectDto projectDto) {
        return null;
    }
}
