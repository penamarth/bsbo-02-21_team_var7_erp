package org.bsbo.dao.impl;

import org.bsbo.dao.ProjectDao;
import org.bsbo.domain.Project;
import org.bsbo.domain.Report;
import org.bsbo.domain.Task;
import org.bsbo.domain.User;

import java.util.ArrayList;
import java.util.List;

public class ProjectDaoImpl implements ProjectDao {
    @Override
    public Project save(Project project) {
        System.out.println("Вызван метод save класса ProjectDaoImpl");
        return new Project();
    }
    @Override
    public Project getProjectStatistics(long id) {
        System.out.println("Вызван метод getProjectStatistics класса ProjectDaoImpl");
        return new Project();
    }
    @Override
    public List<Task> getAllUncompletedTasks(Project project) {
        System.out.println("Вызван метод getAllUncompletedTasks класса ProjectDaoImpl");
        return new ArrayList<>();
    }
    @Override
    public List<Report> getUserMessages(long userId) {
        System.out.println("Вызван метод getUserMessages класса ProjectDaoImpl");
        return new ArrayList<>();
    }
    @Override
    public List<Report> getAllMessages() {
        System.out.println("Вызван метод getAllMessages класса ProjectDaoImpl");
        return new ArrayList<>();
    }

    @Override
    public boolean isProjectWorker(User user, Project project) {
        System.out.println("Вызван метод isProjectWorker класса ProjectDaoImpl");
        return true;
    }

    @Override
    public Project findById(long id) {
        System.out.println("Вызван метод findById класса ProjectDaoImpl");
        return new Project();
    }
}
