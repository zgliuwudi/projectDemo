package com.example.designpattern.designmethod.build2;

/**
 * @ClassName: Test
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 21:15
 * @Version: 1.0
 **/
public class Test {

    @org.junit.Test
    public void test1(){
        Student student = new StudentBuilder().id(1).name("hello").build();
        System.out.println(student);

    }
}
