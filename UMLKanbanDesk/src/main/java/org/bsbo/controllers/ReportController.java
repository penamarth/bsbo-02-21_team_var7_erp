package org.bsbo.controllers;

import org.bsbo.dao.KanbanDeskDao;
import org.bsbo.dto.ReportDto;
import org.bsbo.dto.TaskDto;
import org.bsbo.dto.UserDto;
import org.bsbo.service.ReportManageService;
import org.bsbo.util.ResponseEntity;

import java.util.List;

public class ReportController {
    private final ReportManageService reportManageService;
    private final KanbanDeskDao kanbanDeskDao;
    public ReportController(ReportManageService reportManageService, KanbanDeskDao kanbanDeskDao) {
        this.reportManageService = reportManageService;
        this.kanbanDeskDao = kanbanDeskDao;
    }
    public ResponseEntity<ReportDto> createReport(UserDto userDto, long kanbanDeskId,
                                                  String message, List<TaskDto> tasks) {
        System.out.println("Вызван метод createReport класса ReportController");
        kanbanDeskDao.findProjectByKanban(kanbanDeskId);
        reportManageService.saveReport(new ReportDto());
        return new ResponseEntity<>();
    }
}
