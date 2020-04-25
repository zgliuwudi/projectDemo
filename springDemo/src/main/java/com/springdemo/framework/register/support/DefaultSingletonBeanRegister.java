package com.springdemo.framework.register.support;

import com.springdemo.framework.register.SingletonBeanRegister;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: DefaultSingletonBeanRegister
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-11 06:58
 * @Version: 1.0
 **/
public class DefaultSingletonBeanRegister implements SingletonBeanRegister {

    private Map<String, Object> beanMap = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return beanMap.get(beanName);
    }

    @Override
    public void addSingleton(String beanName, Object bean) {
        beanMap.put(beanName, bean);
    }
}
