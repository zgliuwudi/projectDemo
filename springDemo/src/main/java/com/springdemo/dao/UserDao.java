package com.springdemo.dao;

import com.springdemo.pojo.UserData;

import java.util.List;

public interface UserDao {

    List<UserData> queryUser(String id, Object param);
}
