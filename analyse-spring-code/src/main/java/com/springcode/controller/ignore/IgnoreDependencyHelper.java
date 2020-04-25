package com.springcode.controller.ignore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @ClassName: IgnoreDependencyHelper
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-12 08:39
 * @Version: 1.0
 **/
public class IgnoreDependencyHelper implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.ignoreDependencyInterface(IgnoreDependencyByInterfaceSrv.class);
    }
}
