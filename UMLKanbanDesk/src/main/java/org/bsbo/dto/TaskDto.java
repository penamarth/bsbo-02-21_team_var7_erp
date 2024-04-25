package org.bsbo.dto;

import org.bsbo.domain.TaskStatus;

import java.util.List;

public class TaskDto {
    private TaskStatus taskStatus;
    private String description;
    private List<UserDto> users;
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
    public List<UserDto> getUsers() {
        return users;
    }
    public void setUsers(List<UserDto> users) {
        this.users = users;
    }
}
