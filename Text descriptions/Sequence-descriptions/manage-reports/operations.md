Операция: findProjectByKanban(KanbadDeskID: long)
Предусловия: 
+ положительное число KanbanDeskID
Постусловия:
+ ProjectID, если KanbanDeskID соответствует проект
+ None, если соответствия нет


Операция: isProjectWorker(sender:User, project:Project)
Предусловия:
+ sender: User - существует
+ project: Project - существует
Постусловия:
+ True, если пользователь является рабочим в проекте (Менеджер тоже считается рабочим)
+ Else, если иначе


Операция: saveReport(report : ReportDTO)
Предусловия:
+ Объект ReportDTO, состоящий из списка выполненных задач, sender, Message
Постусловия:
+ Задачи из списка отмечены как выполненные пользователем sender
+ Сообщение сохранено в соответсвии с идентификатором репорта


Операция: markAsDoneBy(task:Task, completedBy:User)
Предусловия:
+ Task существует
+ User существует
Постусловия:
+ Task.completedBy = User.ID


Операция: createMessageForReport(report : ReportDTO)
Предусловия: 
+ Объект ReportDTO, состоящий из списка выполненных задач, sender, Message
Постусловия:
+ Сообщение сохранено в соответсвии с идентификатором репорта


