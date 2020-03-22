package com.example.demo.designpattern.proxy.proxy3;

import java.lang.reflect.Method;

public class MapperProxy implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        // TODO sqlSession 操作数据库，并获取执行结果
        System.out.println("数据库操作,并获取返回值...");
        Object result = null;  // sqlSession操作数据库后的返回结果，写死成null只是为了演示
        return result;
    }
}