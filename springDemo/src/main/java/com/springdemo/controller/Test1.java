package com.springdemo.controller;

import com.springdemo.dao.impl.UserDaoImpl;
import com.springdemo.pojo.UserData;
import com.springdemo.service.impl.UserServiceImpl;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName: Test1
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-05 09:03
 * @Version: 1.0
 **/
public class Test1 {

    @Test
    public void test1(){

        BasicDataSource dataSource = getDataSource();

        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setDataSource(dataSource);

        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao);

        UserData userData = new UserData();
        userData.setUsername("tom");

        List<UserData> userDatas = userService.queryUsers(userData);
        System.out.println(userDatas);
    }

    private BasicDataSource getDataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("liuliu90liu123");
        return dataSource;
    }
}
