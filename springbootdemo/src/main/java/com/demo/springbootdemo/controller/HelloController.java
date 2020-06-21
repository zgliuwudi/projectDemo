package com.demo.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-06-09 23:49
 * @Version: 1.0
 **/
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("errors")
    public String error(){
        int a = 1/0;
        return "";
    }

}
