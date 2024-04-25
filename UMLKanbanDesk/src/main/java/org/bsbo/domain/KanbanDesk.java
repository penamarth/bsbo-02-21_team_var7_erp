package org.bsbo.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KanbanDesk extends AbstractEntity {
    private int sprintNumber;
    private Date sprintStartDate;
    private Date sprintEndDate;
    private List<Task> tasks;
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
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
