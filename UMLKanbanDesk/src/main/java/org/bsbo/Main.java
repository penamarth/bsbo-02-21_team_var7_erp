 
package org.bsbo;

import org.bsbo.controllers.ProjectController;
import org.bsbo.controllers.ReportController;
import org.bsbo.controllers.StatisticsController;
import org.bsbo.controllers.TaskController;
import org.bsbo.dao.*;
import org.bsbo.dao.impl.*;
import org.bsbo.domain.Task;
import org.bsbo.dto.ProjectDto;
import org.bsbo.dto.TaskDto;
import org.bsbo.dto.UserDto;
import org.bsbo.service.ProjectManageService;
import org.bsbo.service.ReportManageService;
import org.bsbo.service.TaskManageService;
import org.bsbo.service.impl.ProjectManageServiceImpl;
import org.bsbo.service.impl.ReportManageServiceImpl;
import org.bsbo.service.impl.TaskManageServiceImpl;
import org.bsbo.util.ResponseEntity;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //TaskManageSequence();
        //ProjectsManageSequence();
        AccessManageSequecne();
        //ReportsManageSequence();
        //StatisticsManageSequence();
    }


    public static void TaskManageSequence(){
        System.out.println("Usecase Управление задачами: ");
        TaskDto dto = new TaskDto();
        TaskDao taskDao = new TaskDaoImpl();
        TaskManageService taskManageService = new TaskManageServiceImpl(taskDao);
        TaskController taskController = new TaskController(taskManageService);
        ResponseEntity<TaskDto> response =  taskController.updateTask(dto);
        System.out.println("Usecase Управление задачами - Завершен");
    }

    public static void ProjectsManageSequence(){
        System.out.println("Usecase Управление проектами: ");
        ProjectDao pdao = new ProjectDaoImpl();
        UserDao udao = new UserDaoImpl();
        ProjectManageService pmservice = new ProjectManageServiceImpl(pdao, udao);
        ProjectController controller = new ProjectController(pmservice);

        ProjectDto dto = new ProjectDto();

        controller.createOrUpdateProject(dto);

        System.out.println("Usecase Управление проектами - Завершен.");
    }

    public static void AccessManageSequecne(){
        System.out.println("Usecase Управление правами доступа: ");

        ProjectDao pdao = new ProjectDaoImpl();
        UserDao udao = new UserDaoImpl();

        ProjectManageService pmservice = new ProjectManageServiceImpl(pdao, udao);

        ProjectController controller = new ProjectController(pmservice);
        controller.addUserToProject(10, 10);

        System.out.println("Usecase Управление правами доступа - Завершен");
    }

    public static void ReportsManageSequence(){
        System.out.println("Usecase Работа с системой отчетов: ");

        TaskDao tdao = new TaskDaoImpl();
        ReportDao rdao = new ReportDaoImpl();

        ReportManageService rmservice = new ReportManageServiceImpl(tdao, rdao);

        KanbanDeskDao kdao = new KanbanDeskDaoImpl();

        ReportController rcont = new ReportController(rmservice, kdao);

        UserDto udto = new UserDto();

        ArrayList<TaskDto> tasks = new ArrayList<TaskDto>();
        rcont.createReport(udto, 10, "Completed new task", tasks);
        System.out.println("Usecase Работа с системой отчетов - Завершен");
    }

    public static void StatisticsManageSequence(){
        System.out.println("Usecase Работа с системой статистики: ");

        ProjectDao pdao = new ProjectDaoImpl();

        StatisticsController statisticsController = new StatisticsController(pdao);

        statisticsController.getStatistics(10, 10);
        System.out.println("Usecase Работа с системой статистики - Завершено");
    }

}
