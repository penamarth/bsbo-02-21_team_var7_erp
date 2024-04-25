package org.bsbo.controllers;

import org.bsbo.dto.ProjectDto;
import org.bsbo.service.ProjectManageService;
import org.bsbo.util.ResponseEntity;

public class ProjectController {
    private final ProjectManageService projectManageService;
    public ProjectController(ProjectManageService projectManageService) {
        this.projectManageService = projectManageService;
    }
//    public ResponseEntity<ProjectDto> createOrUpdateProject(ProjectDto projectDto) {
//        return null;
//    }
    public ResponseEntity<ProjectDto> update(ProjectDto projectDto) {
        ResponseEntity<ProjectDto> responseEntity = new ResponseEntity<>();
        responseEntity.setBody(projectManageService.createOrUpdateProject(projectDto));
        responseEntity.setCode(200);
        return responseEntity;
    }
    public ResponseEntity<ProjectDto> addUserToProject(long userId, long projectId) {
        ResponseEntity<ProjectDto> responseEntity = new ResponseEntity<>();
        responseEntity.setBody(projectManageService.addUserToProject(userId, projectId));
        responseEntity.setCode(200);
        return responseEntity;
    }
}
