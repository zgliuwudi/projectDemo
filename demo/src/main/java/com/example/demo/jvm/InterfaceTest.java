package com.example.demo.jvm;

import org.junit.Test;

/**
 * @ClassName: InterfaceTest
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-05-01 13:30
 * @Version: 1.0
 **/
public class InterfaceTest {

    @Test
    public void test1(){
        InterfaceImpl interfaceImpl = new InterfaceImpl();
        interfaceImpl.eat();
    }
}
