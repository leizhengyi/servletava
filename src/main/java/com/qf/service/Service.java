package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface Service {
    List<User> SelectAll();
    User selectById(Integer id);
}
