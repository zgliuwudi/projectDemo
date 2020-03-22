package com.example.demo.designpattern.proxy.proxy3;

import java.lang.reflect.Method;

public class DaoProxy implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("DaoProxy 操作....");
        Object result = null;  // sqlSession操作数据库后的返回结果，写死成null只是为了演示
        return result;
    }
}