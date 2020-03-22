package com.example.demo.designpattern.proxy.proxy2;

import org.junit.jupiter.api.Test;

class ProxyTest {

    @Test
    public void proxyTest() throws Exception {
        // Proxy.generateJavaFileByJavaPoet(UserMapper.class);
        UserMapper userMapper = Proxy.newInstance(UserMapper.class);
        userMapper.getUserById(12);
    }

}