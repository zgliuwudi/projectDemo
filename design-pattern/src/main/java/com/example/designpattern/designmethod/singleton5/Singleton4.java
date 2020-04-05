package com.example.designpattern.designmethod.singleton5;

/**
 * @ClassName: Singleton4
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-05 00:32
 * @Version: 1.0
 **/
public class Singleton4 {

    private static class SingletonBuilder{
        private static final Singleton4 singleton4 = new Singleton4();
    }

    private Singleton4() {

    }

    public static Singleton4 getInstace(){
        return SingletonBuilder.singleton4;
    }
}
