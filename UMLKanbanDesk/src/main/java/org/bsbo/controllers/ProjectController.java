package org.bsbo.controllers;

import org.bsbo.dto.ProjectDto;
import org.bsbo.service.ProjectManageService;
import org.bsbo.util.ResponseEntity;

public class ProjectController {
    private final ProjectManageService projectManageService;
    public ProjectController(ProjectManageService projectManageService) {
        this.projectManageService = projectManageService;
    }
    public ResponseEntity<ProjectDto> createOrUpdateProject(ProjectDto projectDto) {
        System.out.println("Вызван метод createOrUpdateProject класса ProjectController");
        projectManageService.createOrUpdateProject(projectDto);
        return new ResponseEntity<>();
    }
    public ResponseEntity<ProjectDto> addUserToProject(long userId, long projectId) {
        System.out.println("Вызван метод addUserToProject класса ProjectController");
        projectManageService.addUserToProject(userId, projectId);
        return new ResponseEntity<>();
    }
}
