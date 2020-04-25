package com.springcode.controller;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName: AnalyseCode1
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-11 18:11
 * @Version: 1.0
 **/
public class AnalyseCode1 {

    /**
     * old
     */
    @Test
    public void test1(){
        String path = "ignore/ignore_interface.xml";
        ClassPathResource classPathResource = new ClassPathResource(path);
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(classPathResource);
        xmlBeanFactory.getBean("ignorDependency");
        System.out.println("test1");
    }

    /**
     * new
     */
    @Test
    public void test2(){
        String path = "ignore/ignore_interface.xml";
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(path);
        beanFactory.getBean("ignorDependency");
    }

    @Test
    public void test3(){
        System.out.println(System.getProperties());
        System.out.println(System.getenv());
    }

    @Test
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("");

    }

}
