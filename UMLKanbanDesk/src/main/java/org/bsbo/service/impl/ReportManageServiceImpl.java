package org.bsbo.service.impl;

import org.bsbo.dao.ReportDao;
import org.bsbo.dao.TaskDao;
import org.bsbo.domain.Task;
import org.bsbo.domain.User;
import org.bsbo.dto.ProjectDto;
import org.bsbo.dto.ReportDto;
import org.bsbo.service.ProjectManageService;
import org.bsbo.service.ReportManageService;

public class ReportManageServiceImpl implements ReportManageService {
    private final TaskDao taskDao;
    private final ReportDao reportDao;
    public ReportManageServiceImpl(TaskDao taskDao, ReportDao reportDao) {
        this.taskDao = taskDao;
        this.reportDao = reportDao;
    }
    @Override
    public ReportDto saveReport(ReportDto reportDto) {
        System.out.println("Вызван метод saveReport класса ReportManageServiceImpl");
        taskDao.markAsDoneBy(new Task(), new User());
        reportDao.createMessageForReport(reportDto);
        return null;
    }
}
