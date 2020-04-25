package com.springdemo.controller;

import com.springdemo.framework.factory.support.DefaultLisableFactory;
import com.springdemo.framework.reader.XmlBeanDefinitonReader;
import com.springdemo.framework.resource.support.ClasspathResource;
import com.springdemo.pojo.UserData;
import com.springdemo.service.UserService;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName: Test3
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-11 08:45
 * @Version: 1.0
 **/
public class Test3 {

    private static final String XMLNAME = "bean2.xml";

    @Test
    public void test1(){
        DefaultLisableFactory factory = new DefaultLisableFactory();

        InputStream inputStream = new ClasspathResource(XMLNAME).getResource();
        if (null == inputStream) {
            return;
        }
        XmlBeanDefinitonReader definitonReader = new XmlBeanDefinitonReader(factory);
        definitonReader.loadBeanDefinition(inputStream);
        if (null != inputStream) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        UserService userService = (UserService) factory.getBean("userService");

        UserData userData = new UserData();
        userData.setUsername("tom");

        List<UserData> list = userService.queryUsers(userData);
        System.out.println(list);
    }
}
