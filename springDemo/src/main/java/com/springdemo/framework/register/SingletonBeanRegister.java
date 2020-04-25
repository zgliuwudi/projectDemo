package com.springdemo.framework.register;

/**
 * 一级缓存接口
 */
public interface SingletonBeanRegister {

    Object getSingleton(String beanName);

    void addSingleton(String beanName,Object bean);
}
