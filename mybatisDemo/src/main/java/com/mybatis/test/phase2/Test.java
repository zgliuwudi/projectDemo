package com.mybatis.test.phase2;

import com.mybatis.test.phase1.pojo.User;
import com.mybatis.test.phase2.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: Test
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-28 22:18
 * @Version: 1.0
 **/
public class Test {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String source = "phase2/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @org.junit.Test
    public void testSelect(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectUser(1);
        System.out.println(user);
    }

}
