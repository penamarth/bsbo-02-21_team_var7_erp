package org.bsbo.dto;

import org.bsbo.domain.KanbanDesk;

import java.util.Date;

public class ProjectDto {
    private String name;
    private String projectGoal;
    private Date deadline;
    private String customer;
    private KanbanDeskDto kanbanDeskDto;
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
    public KanbanDeskDto getKanbanDeskDto() {
        return kanbanDeskDto;
    }
    public void setKanbanDeskDto(KanbanDeskDto kanbanDeskDto) {
        this.kanbanDeskDto = kanbanDeskDto;
    }
}
