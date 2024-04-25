package org.bsbo.dao;

import org.bsbo.domain.KanbanDesk;
import org.bsbo.domain.Project;

public interface KanbanDeskDao {
    KanbanDesk findById(long id);
    Project findProjectByKanban(long id);
}
