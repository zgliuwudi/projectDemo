package com.example.demo.designpattern.proxy.proxy3;

import java.lang.reflect.Method;

/**
 * @ClassName: InvocationHandler
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-21 23:36
 * @Version: 1.0
 **/
public interface InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args);
}
