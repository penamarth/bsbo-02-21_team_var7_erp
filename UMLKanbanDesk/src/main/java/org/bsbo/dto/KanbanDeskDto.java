package org.bsbo.dto;

import java.util.Date;
import java.util.List;

public class KanbanDeskDto {
    private int sprintNumber;
    private Date sprintStartDate;
    private Date sprintEndDate;
    private List<TaskDto> tasks;
    public int getSprintNumber() {
        return sprintNumber;
    }
    public void setSprintNumber(int sprintNumber) {
        this.sprintNumber = sprintNumber;
    }
    public Date getSprintStartDate() {
        return sprintStartDate;
    }
    public void setSprintStartDate(Date sprintStartDate) {
        this.sprintStartDate = sprintStartDate;
    }
    public Date getSprintEndDate() {
        return sprintEndDate;
    }
    public void setSprintEndDate(Date sprintEndDate) {
        this.sprintEndDate = sprintEndDate;
    }
    public List<TaskDto> getTasks() {
        return tasks;
    }
    public void setTasks(List<TaskDto> tasks) {
        this.tasks = tasks;
    }
}
