package com.springcode.controller.ignore;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @ClassName: Test
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-12 08:41
 * @Version: 1.0
 **/
public class Test {

    @org.junit.Test
    public void test1(){
        String path = "ignore/ignore_interface.xml";
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(path);
        IgnoreDependencyHelper helper = beanFactory.getBean(IgnoreDependencyHelper.class);
        helper.postProcessBeanFactory(beanFactory);
        IgnoreDependencyByInterfaceImpl ignorDependency = (IgnoreDependencyByInterfaceImpl) beanFactory.getBean("ignorDependency");
        System.out.println(ignorDependency.getList());
    }

}
