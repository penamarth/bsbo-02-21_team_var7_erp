package org.bsbo.dao.impl;

import org.bsbo.dao.TaskDao;
import org.bsbo.domain.Task;
import org.bsbo.domain.User;

public class TaskDaoImpl implements TaskDao {
    @Override
    public Task findById(long id) {
        System.out.println("Вызван метод findById класса TaskDaoImpl");
        return new Task();
    }
    @Override
    public Task save(Task task) {
        System.out.println("Вызван метод save класса TaskDaoImpl");
        findById(task.getId());
        return new Task();
    }
    @Override
    public Task markAsDoneBy(Task task, User user) {
        System.out.println("Вызван метод markAsDoneBy класса TaskDaoImpl");
        return new Task();
    }
}
