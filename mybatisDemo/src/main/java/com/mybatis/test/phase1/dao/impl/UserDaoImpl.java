package com.mybatis.test.phase1.dao.impl;

import com.mybatis.test.phase1.dao.UserDao;
import com.mybatis.test.phase1.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @ClassName: UserDaoImpl
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-28 21:49
 * @Version: 1.0
 **/
public class UserDaoImpl implements UserDao {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public User findUserById(int id) throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user;
        try {
            user = sqlSession.selectOne("test.selectUser",1);
        } finally {
            sqlSession.close();
        }
        return user;
    }

    public List<User> findUsersByName(String name) throws Exception {
        return null;
    }
}
