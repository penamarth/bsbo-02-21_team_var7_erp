package org.bsbo.dao.impl;

import org.bsbo.dao.UserDao;
import org.bsbo.domain.User;

public class UserDaoImpl implements UserDao {
    @Override
    public User findById(long id) {
        System.out.println("Вызван метод findById класса UserDaoImpl");
        return new User();
    }
}
