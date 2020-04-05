package com.example.designpattern.designmethod.template4;

/**
 * @ClassName: Son1
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 22:39
 * @Version: 1.0
 **/
public class Son1 extends Parent {
    @Override
    protected void method() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
