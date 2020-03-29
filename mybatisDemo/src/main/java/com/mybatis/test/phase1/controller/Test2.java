package com.mybatis.test.phase1.controller;

import com.mybatis.test.phase1.dao.UserDao;
import com.mybatis.test.phase1.dao.impl.UserDaoImpl;
import com.mybatis.test.phase1.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: Test2
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-28 21:44
 * @Version: 1.0
 **/
public class Test2 {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "phase1/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testSelectUser(){
        UserDao userDao = new UserDaoImpl(sqlSessionFactory);
        try {
            User user = userDao.findUserById(1);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
