package com.springdemo.service;

import com.springdemo.pojo.UserData;

import java.util.List;

public interface UserService {

    List<UserData> queryUsers(UserData userData);
}
