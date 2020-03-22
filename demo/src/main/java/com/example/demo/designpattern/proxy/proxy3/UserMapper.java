package com.example.demo.designpattern.proxy.proxy3;

/**
 * @ClassName: UserMapper
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-21 23:35
 * @Version: 1.0
 **/
public interface UserMapper {

    Integer save(User user);

    User getUserById(Integer id);

    Integer delete(Integer id);
}
