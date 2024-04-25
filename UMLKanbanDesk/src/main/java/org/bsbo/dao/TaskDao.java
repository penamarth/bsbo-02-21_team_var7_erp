package org.bsbo.dao;

import org.bsbo.domain.Task;

public interface TaskDao {
    Task findById(long id);
}
