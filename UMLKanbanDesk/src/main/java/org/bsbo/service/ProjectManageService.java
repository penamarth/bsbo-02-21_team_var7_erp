package org.bsbo.service;

import org.bsbo.dto.ProjectDto;

public interface ProjectManageService {
    ProjectDto createOrUpdateProject(ProjectDto projectDto);
    ProjectDto addUserToProject(long userId, long projectId);
}
