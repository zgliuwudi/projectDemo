package com.example.demo.designpattern.proxy.proxy3;


import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    public void test() throws Exception {
        // InvocationHandler mapperProxy = new MapperProxy();
        InvocationHandler mapperProxy = new DaoProxy();
        UserMapper userMapper = Proxy.newInstance(UserMapper.class, mapperProxy);
        System.out.println(userMapper.delete(1));
        System.out.println("=================");
        System.out.println(userMapper.getUserById(1));
    }
}
