package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.dao.impl.UserDaoImpl;
import com.qf.pojo.User;
import com.qf.service.Service;

import java.util.List;

public class ServiceImpl implements Service {

    @Override
    public List<User> SelectAll() {
        UserDaoImpl userDao = new UserDaoImpl();
        return userDao.SelectAll();
    }

    @Override
    public User selectById(Integer id) {
        UserDaoImpl userDao = new UserDaoImpl();
        return null;
    }
}
