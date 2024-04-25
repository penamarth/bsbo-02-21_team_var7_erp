package org.bsbo.dao.impl;

import org.bsbo.dao.KanbanDeskDao;
import org.bsbo.domain.KanbanDesk;
import org.bsbo.domain.Project;

public class KanbanDeskDaoImpl implements KanbanDeskDao {
    @Override
    public KanbanDesk findById(long id) {
        System.out.println("Вызван метод findById класса KanbanDeskDaoImpl");
        return new KanbanDesk();
    }
    @Override
    public Project findProjectByKanban(long id) {
        System.out.println("Вызван метод findProjectByKanban класса KanbanDeskDaoImpl");
        return new Project();
    }
}
