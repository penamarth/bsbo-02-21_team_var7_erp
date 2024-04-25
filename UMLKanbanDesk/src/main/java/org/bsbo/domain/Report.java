package org.bsbo.domain;

import java.util.List;

public class Report {
    private User user;
    private KanbanDesk kanbanDesk;
    private List<Task> tasks;
    private String message;
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public KanbanDesk getKanbanDesk() {
        return kanbanDesk;
    }
    public void setKanbanDesk(KanbanDesk kanbanDesk) {
        this.kanbanDesk = kanbanDesk;
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
