package org.bsbo.controllers;

import org.bsbo.dto.TaskDto;
import org.bsbo.service.TaskManageService;
import org.bsbo.util.ResponseEntity;

public class TaskController {
    private final TaskManageService taskManageService;
    public TaskController(TaskManageService taskManageService) {
        this.taskManageService = taskManageService;
    }
    public ResponseEntity<TaskDto> updateTask(TaskDto taskDto) {
        System.out.println("Вызван метод updateTask класса TaskController");
        taskManageService.updateTask(taskDto);
        return new ResponseEntity<>();
    }
}
