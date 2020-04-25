package com.springdemo.framework.register;

import com.springdemo.framework.ioc.BeanDefinition;

import java.util.List;

/**
 * @ClassName: BeanDefinitonRegister
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-11 06:49
 * @Version: 1.0
 **/
public interface BeanDefinitonRegister {

    BeanDefinition getBeanDefiniton(String beanName);

    List<BeanDefinition> getBeanDefinitons();

    void registerBeanDefinition(String beanName,BeanDefinition beanDefinition);
}
