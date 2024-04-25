package org.bsbo.dto;

import org.bsbo.domain.TaskStatus;

import java.util.List;

public class TaskDto {
    private TaskStatus taskStatus;
    private String description;
    private UserDto user;
    public TaskStatus getTaskStatus() {
        return taskStatus;
    }
    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public UserDto getUser() {
        return user;
    }
    public void setUser(UserDto user) {
        this.user = user;
    }
}
