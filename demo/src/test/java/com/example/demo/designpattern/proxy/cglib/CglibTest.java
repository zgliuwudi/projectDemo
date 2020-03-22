package com.example.demo.designpattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import org.junit.jupiter.api.Test;

/**
 * @ClassName: CglibTest
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-21 23:56
 * @Version: 1.0
 **/
public class CglibTest {
    @Test
    public void cglibTest() {
        MethodInterceptor interceptor = new DaoMethodInterceptor();

        IUserDao userDao = DaoProxyFactory.newInstance(IUserDao.class, interceptor);
        int result = userDao.delete(1);
        System.out.println("result = " + result);
    }
}
