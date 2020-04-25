package com.springdemo.service.impl;

import com.springdemo.dao.UserDao;
import com.springdemo.pojo.UserData;
import com.springdemo.service.UserService;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-05 08:52
 * @Version: 1.0
 **/
public class UserServiceImpl implements UserService {

    @Getter
    @Setter
    private UserDao userDao;

    public List<UserData> queryUsers(UserData userData) {
        return userDao.queryUser("queryUserById",userData);
    }

}
