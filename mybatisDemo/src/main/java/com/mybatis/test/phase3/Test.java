package com.mybatis.test.phase3;

import com.github.pagehelper.PageHelper;
import com.mybatis.test.phase3.mapper.UserdataMapper;
import com.mybatis.test.phase3.pojo.Userdata;
import com.mybatis.test.phase3.pojo.UserdataExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: Test
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-29 09:09
 * @Version: 1.0
 **/
public class Test {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("phase3/mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void test1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserdataMapper userMapper = sqlSession.getMapper(UserdataMapper.class);
        UserdataExample userdataExample = new UserdataExample();
        List<Userdata> users = userMapper.selectByExample(userdataExample);
        System.out.println(users);
        sqlSession.close();
    }

    @org.junit.Test
    public void test2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserdataMapper userMapper = sqlSession.getMapper(UserdataMapper.class);
        UserdataExample userdataExample = new UserdataExample();
        // 分页
        PageHelper.startPage(2, 1);
        List<Userdata> users = userMapper.selectByExample(userdataExample);
        System.out.println(users);
        sqlSession.close();
    }
}
