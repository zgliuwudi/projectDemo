package com.example.designpattern.designmethod.template4;

/**
 * @ClassName: Test
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 22:40
 * @Version: 1.0
 **/
public class Test {

    @org.junit.Test
    public void test1(){
        Parent son1 = new Son1();
        son1.cost();

        Parent son2 = new Son2();
        son2.cost();
    }
}
