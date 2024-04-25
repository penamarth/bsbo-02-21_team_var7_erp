package org.bsbo.dao;

import org.bsbo.domain.User;

public interface UserDao {
    User findById(long id);
}
