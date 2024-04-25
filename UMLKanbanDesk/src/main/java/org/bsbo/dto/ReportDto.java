package org.bsbo.dto;

import java.util.List;

public class ReportDto {
    private UserDto userDto;
    private KanbanDeskDto kanbanDeskDto;
    private List<TaskDto> tasks;
    private String message;
    public UserDto getUserDto() {
        return userDto;
    }
    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
    public KanbanDeskDto getKanbanDeskDto() {
        return kanbanDeskDto;
    }
    public void setKanbanDeskDto(KanbanDeskDto kanbanDeskDto) {
        this.kanbanDeskDto = kanbanDeskDto;
    }
    public List<TaskDto> getTasks() {
        return tasks;
    }
    public void setTasks(List<TaskDto> tasks) {
        this.tasks = tasks;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
