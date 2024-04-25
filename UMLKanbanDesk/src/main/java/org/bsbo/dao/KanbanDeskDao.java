package org.bsbo.dao;

import org.bsbo.domain.KanbanDesk;

public interface KanbanDeskDao {
    KanbanDesk findById(long id);
}
