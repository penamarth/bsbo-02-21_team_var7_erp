package org.bsbo.domain;

import org.bsbo.Abstract.AbstractEntity;

import java.util.Date;
import java.util.ArrayList;

public class Project extends AbstractEntity {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectGoal() {
        return projectGoal;
    }

    public void setProjectGoal(String projectGoal) {
        this.projectGoal = projectGoal;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public KanbanDesk getKanbanDesk() {
        return kanbanDesk;
    }

    public void setKanbanDesk(KanbanDesk kanbanDesk) {
        this.kanbanDesk = kanbanDesk;
    }

    public ArrayList<User> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<User> workers) {
        this.workers = workers;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    private String name;
    private String projectGoal;
    private Date deadline;

    private String customer;
    private KanbanDesk kanbanDesk;
    private ArrayList<User> workers;
    private User manager;




}
