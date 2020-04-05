package com.example.designpattern.designmethod.template4;

/**
 * @ClassName: Parent
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 22:32
 * @Version: 1.0
 **/
public  abstract  class Parent {

    public void cost(){
        long startTime = System.currentTimeMillis();
        method();
        System.out.println(System.currentTimeMillis()-startTime);
    }

    protected abstract void method();
}
