package com.qf.dao.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private Connection connection=null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    @Override
    public List<User> SelectAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
     connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf8","root","root");
     statement=connection.createStatement();
     String sql ="SELECT u_id id,u_name NAME,u_pass pass,u_gender gender,u_email email FROM users where 1=1";
            resultSet=statement.executeQuery(sql);
           List userlist = new ArrayList();
            while(resultSet.next()){
                User user = new User();
                user.setUid(resultSet.getInt("id"));
                user.setGender(resultSet.getString("gender"));
                user.setPass(resultSet.getString("pass"));
                user.setUname(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                userlist.add(user);
            }
            return userlist;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public User selectById(Integer id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/mishop?characterEncoding=utf8","root","root");
            statement=connection.createStatement();
            String sql ="SELECT u_id id,u_name NAME,u_pass pass,u_gender gender,u_email email FROM users where id="+id;
            resultSet=statement.executeQuery(sql);
            User user = new User();
            while(resultSet.next()){
                user.setUid(resultSet.getInt("id"));
                user.setGender(resultSet.getString("gender"));
                user.setPass(resultSet.getString("pass"));
                user.setUname(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
