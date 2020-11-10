package com.qf.dao;

import com.qf.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> SelectAll();
    User selectById(Integer id);
}
