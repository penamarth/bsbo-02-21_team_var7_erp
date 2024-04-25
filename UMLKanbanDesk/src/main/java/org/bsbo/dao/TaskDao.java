package org.bsbo.dao;

import org.bsbo.domain.Task;
import org.bsbo.domain.User;

public interface TaskDao {
    Task findById(long id);
    Task save(Task task);
    Task markAsDoneBy(Task task, User user);
}
