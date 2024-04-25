package org.bsbo.domain;

public class Task extends AbstractEntity {
    private TaskStatus taskStatus;
    private String description;
    private User completedBy;
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
    public User getCompletedBy() {
        return completedBy;
    }
    public void setCompletedBy(User completedBy) {
        this.completedBy = completedBy;
    }
}
