package com.springdemo.framework.factory.support;

import com.springdemo.framework.factory.BeanFactory;
import com.springdemo.framework.register.support.DefaultSingletonBeanRegister;
import com.springdemo.framework.ioc.BeanDefinition;

/**
 * @ClassName: AbstractBeanFactory
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-11 06:54
 * @Version: 1.0
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegister implements BeanFactory {

    @Override
    public Object getBean(String beanName) {
        // 从一级缓存里取内容
        Object singletonbean = getSingleton(beanName);
        if (null != singletonbean) {
            return singletonbean;
        }

        BeanDefinition beanDefinition = getBeanDefiniton(beanName);
        singletonbean = getBeanByDefiniton(beanDefinition);
        addSingleton(beanName,singletonbean);

        return singletonbean;
    }

    protected abstract Object getBeanByDefiniton(BeanDefinition beanDefinition);

    protected abstract BeanDefinition getBeanDefiniton(String beanName);
}
