package com.mybatis.test.phase2.mapper;

import com.mybatis.test.phase1.pojo.User;

/**
 * @ClassName: UserMapper
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-28 22:14
 * @Version: 1.0
 **/
public interface UserMapper {

    User selectUser(int id);
}
