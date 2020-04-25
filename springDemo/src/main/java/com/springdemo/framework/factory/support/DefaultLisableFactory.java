package com.springdemo.framework.factory.support;

import com.springdemo.framework.ioc.BeanDefinition;
import com.springdemo.framework.register.BeanDefinitonRegister;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: DefaultLisableFactory
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-11 07:13
 * @Version: 1.0
 **/
public class DefaultLisableFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitonRegister {

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public BeanDefinition getBeanDefiniton(String beanName) {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public List<BeanDefinition> getBeanDefinitons() {
        return null;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
