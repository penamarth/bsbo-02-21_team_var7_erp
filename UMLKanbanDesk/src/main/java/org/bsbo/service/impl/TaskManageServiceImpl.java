package org.bsbo.service.impl;

import org.bsbo.dao.TaskDao;
import org.bsbo.domain.Task;
import org.bsbo.dto.TaskDto;
import org.bsbo.service.TaskManageService;

public class TaskManageServiceImpl implements TaskManageService {
    private final TaskDao taskDao;
    public TaskManageServiceImpl(TaskDao taskDao) {
        this.taskDao = taskDao;
    }
    @Override
    public TaskDto updateTask(TaskDto taskDto) {
        System.out.println("Вызван метод updateTask класса TaskManageServiceImpl");
        taskDao.findById(taskDto.getId());
        taskDao.save(new Task());
        return new TaskDto();
    }
}
