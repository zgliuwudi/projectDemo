package com.example.demo.designpattern.proxy.proxy4;

import org.junit.jupiter.api.Test;

/**
 * @ClassName: JdkProxyTest
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-21 23:46
 * @Version: 1.0
 **/
public class JdkProxyTest {
    @Test
    public void testProxy() {

        // 代理逻辑处理handler
        MapperProxy mapperProxy = new MapperProxy(UserMapper.class);

        // 代理实例工厂
        MapperProxyFactory proxyFactory = new MapperProxyFactory(UserMapper.class);

        // 获取代理对象
        UserMapper mapper = (UserMapper) proxyFactory.newInstance(mapperProxy);

        int delete = mapper.delete(1);
        System.out.println("result = " + delete);
    }
}
