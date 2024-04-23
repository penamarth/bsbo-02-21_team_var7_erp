Операция: hasUserAccessToProject(accessPolicy: AccessManagePolicy)
Предусловия: 
+ объект AccessManagePolicy (формируется на основе конструктора AccessManagePolicy(user:User, project:Project, access:String))
Постусловия:
+ Проверяет, есть ли у пользователя доступ, соответствующий политике AccessManagePolicy
+ True, если "у пользователя есть доступ к проекту"
+ False, если иначе


Операция: findByID(id: long)
Предусловия: нет
Постусловия
+ Возвращает искомую сущность
+ Исключение NoSuchProject, NoSuchUser если объект не найден в базе данных

Операция: isProjectManager(id: long, id: long)
Предусловия: нет
Постусловия
+ Проверяет в базе данных, есть ли у пользователя доступ уровня Manager
+ True, если "пользователь является менеджером проекта"
+ False, если иначе


Операция: updateUserAccessToProject(accessPolicy: AccessManagePolicy)
Предусловия: 
+ объект AccessManagePolicy (формируется на основе конструктора AccessManagePolicy(user: User, project:Project, access:String))
Постусловия:
+ Проверяет наличие User в системе, а затем обращается к базе данных для обновления политики доступа
+ True, если обновление произведено
+ UnknownError, если ошибка произошла на моменте записи в базу данных 
+ NoSuchUser, если не найден пользователь

Операция: setAccessToProject(id: long, id: long, access: Access)
Предусловия: нет
Постусловия:
+ Обращается к базе данных для замены политики доступа
+ True, если установка значения произведена
+ UnknownError, если ошибка произошла на моменте записи в базу данных 




