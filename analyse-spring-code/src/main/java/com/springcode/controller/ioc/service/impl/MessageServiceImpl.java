package com.springcode.controller.ioc.service.impl;

import com.springcode.controller.ioc.service.MessageService;

/**
 * @ClassName: MessageServiceImpl
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-19 22:00
 * @Version: 1.0
 **/
public class MessageServiceImpl implements MessageService {
    public void getMessage() {
        System.out.println("get message ********");
    }
}
