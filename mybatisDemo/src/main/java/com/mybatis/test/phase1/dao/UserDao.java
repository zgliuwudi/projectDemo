package com.mybatis.test.phase1.dao;

import com.mybatis.test.phase1.pojo.User;

import java.util.List;

/**
 * @ClassName: UserDao
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-28 21:47
 * @Version: 1.0
 **/
public interface UserDao {

    public User findUserById(int id) throws Exception;
    public List<User> findUsersByName(String name) throws Exception;
}
