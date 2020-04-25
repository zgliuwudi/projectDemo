package com.springcode.controller.ignore.type;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @ClassName: Test
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-12 08:54
 * @Version: 1.0
 **/
public class Test {

    @org.junit.Test
    public void test1(){
        String path = "ignore/ignore_type.xml";
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(path);
//        IgnoreDependencyTypeHelper helper = beanFactory.getBean(IgnoreDependencyTypeHelper.class);
//        helper.postProcessBeanFactory(beanFactory);
        IgnoreDependencyByType ignorDependency = (IgnoreDependencyByType) beanFactory.getBean("ignorDependency");
        System.out.println(ignorDependency.getList());
    }
}
