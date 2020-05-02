package com.example.demo.jvm;

/**
 * @ClassName: InterfaceImpl
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-05-01 13:31
 * @Version: 1.0
 **/
public class InterfaceImpl implements SonInterface {

    @Override
    public void eat() {
        System.out.println(this.sonValue);
        System.out.println(this.parentValue);
    }
}
