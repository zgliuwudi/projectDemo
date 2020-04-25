package com.springcode.controller.ioc;

import com.springcode.controller.ioc.service.MessageService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: TestIoc
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-19 22:01
 * @Version: 1.0
 **/
public class TestIoc {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ioc/applicationContext-spring.xml");
        MessageService messageService = (MessageService) context.getBean("messageService");
        messageService.getMessage();
    }
}
