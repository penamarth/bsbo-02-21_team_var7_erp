package org.bsbo.service.impl;

import org.bsbo.dao.ProjectDao;
import org.bsbo.dao.UserDao;
import org.bsbo.domain.Project;
import org.bsbo.domain.User;
import org.bsbo.dto.ProjectDto;
import org.bsbo.service.ProjectManageService;

public class ProjectManageServiceImpl implements ProjectManageService {
    private final ProjectDao projectDao;
    private final UserDao userDao;
    public ProjectManageServiceImpl(ProjectDao projectDao, UserDao userDao) {
        this.projectDao = projectDao;
        this.userDao = userDao;
    }
    @Override
    public ProjectDto createOrUpdateProject(ProjectDto projectDto) {
        System.out.println("Вызван метод createOrUpdateProject класса ProjectManageServiceImpl");
        projectDao.save(new Project());
        userDao.findById(10);
        projectDao.findById(10);
        userDao.findById(10);
        projectDao.save(new Project());
        return new ProjectDto();
    }

    @Override
    public ProjectDto addUserToProject(long userId, long projectId) {
        System.out.println("Вызван метод addUserToProject класса ProjectManageServiceImpl");
        getAuthorizatedUser();
        return new ProjectDto();
    }

    private User getAuthorizatedUser() {
        System.out.println("Вызван метод getAuthorizatedUser класса ProjectManageServiceImpl");
        return new User();
    }
}
