package org.bsbo.service.impl;

import org.bsbo.dao.TaskDao;
import org.bsbo.dto.TaskDto;
import org.bsbo.service.TaskManageService;

public class TaskManageServiceImpl implements TaskManageService {
    private final TaskDao taskDao;
    public TaskManageServiceImpl(TaskDao taskDao) {
        this.taskDao = taskDao;
    }
    @Override
    public TaskDto updateTask(TaskDto taskDto) {
        return null;
    }
}
