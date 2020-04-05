package com.example.designpattern.designmethod.singleton5;

/**
 * @ClassName: Singleton1
 * @program: projectDemo
 * @Description: 饿汉式
 * @Author: admin
 * @Date: 2020-04-04 23:15
 * @Version: 1.0
 **/
public class Singleton1 {

    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
