package com.mybatis.test.phase1.controller;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: Test1
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-28 21:19
 * @Version: 1.0
 **/
public class Test1 {

    public static void main(String[] args) {
        String resource = "phase1/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Object o = sqlSession.selectOne("test.selectUser",1);
        System.out.println(o);
    }
}
