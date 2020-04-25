package com.springdemo.controller;

import com.springdemo.ioc.BeanDefinition;
import com.springdemo.ioc.PropertyDefiniton;
import com.springdemo.ioc.RefDefinition;
import com.springdemo.ioc.ValueDefiniton;
import com.springdemo.pojo.UserData;
import com.springdemo.service.UserService;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: Test2
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-09 22:16
 * @Version: 1.0
 **/
public class Test2 {

    private static final String XMLNAME = "bean2.xml";

    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Test
    public void test(){
        // 解析xml文件
        pareXml();
        UserService userService = (UserService) getBean("userService");

        UserData userData = new UserData();
        userData.setUsername("tom");

        List<UserData> list = userService.queryUsers(userData);
        System.out.println(list);
    }

    private Object getBean(String beanName) {
        BeanDefinition beanDefinition = this.beanDefinitionMap.get(beanName);
        return getBeanByDefiniton(beanDefinition);
    }

    private Object getBeanByDefiniton(BeanDefinition beanDefinition) {
        // 实例化
        String className = beanDefinition.getClassName();
        Object bean = createInstanceBean(className);
        // 依赖注入
        populateBean(bean,beanDefinition);
        // 初始化
        initMethod(bean,beanDefinition.getInitMethod());

        return bean;
    }

    private void initMethod(Object bean, String initMethod) {
        if (null == initMethod) {
            return;
        }
        try {
            Class<?> aClass = bean.getClass();
            Method method = aClass.getDeclaredMethod(initMethod);
            method.invoke(bean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void populateBean(Object bean, BeanDefinition beanDefinition) {
        List<PropertyDefiniton> propertyDefinitonList = beanDefinition.getPropertyDefinitonList();
        if (null != propertyDefinitonList && !propertyDefinitonList.isEmpty()) {
            for (PropertyDefiniton propertyDefiniton : propertyDefinitonList) {
                Object valueNum = null;
                Object value = propertyDefiniton.getValue();
                if (value instanceof ValueDefiniton) {
                    ValueDefiniton definiton = (ValueDefiniton) value;
                    valueNum = definiton.getValue();
                }else if (value instanceof  RefDefinition){
                    RefDefinition refDefinition = (RefDefinition) value;
                    valueNum = getBean(refDefinition.getRef());
                }else {

                }
                setProperty(bean,propertyDefiniton.getName(),valueNum);

            }
        }
    }

    private void setProperty(Object bean, String name, Object valueNum) {
        try {
            Class<?> aClass = bean.getClass();
            // 不是这个 aClass.getField("")
            Field field = aClass.getDeclaredField(name);
            field.setAccessible(true);
            field.set(bean, valueNum);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private Object createInstanceBean(String className) {
        try {
            Class<?> aClass = Class.forName(className);
            Constructor<?> constructor = aClass.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    private void pareXml() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(XMLNAME);
        if (null == inputStream) {
            return;
        }
        Document document = createDocument(inputStream);
        if (null == document) {
            return;
        }
        paresBeanDocument(document.getRootElement());
        if (null != inputStream) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * root 元素解析
     * @param rootElement
     */
    private void paresBeanDocument(Element rootElement) {
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            String name = element.getName();
            if (name.equals("bean")) {
                parseBeanElement(element);
            }else{
                // TODO
            }
        }
    }

    /**
     * bean 属性解析
     * @param beanElement
     */
    private void parseBeanElement(Element beanElement) {
        String id = beanElement.attributeValue("id");
        String className = beanElement.attributeValue("class");
        String initMethod = beanElement.attributeValue("init-method");
        BeanDefinition beanDefinition = new BeanDefinition(id, className);
        beanDefinition.setInitMethod(initMethod);
        List<Element> propertityElements = beanElement.elements();
        for (Element propertityElement : propertityElements) {
            parsePropertyElement(beanDefinition,propertityElement);
        }
        this.beanDefinitionMap.put(id, beanDefinition);
    }

    /**
     * property 属性解析
     * @param beanDefinition
     * @param propertityElement
     */
    private void parsePropertyElement(BeanDefinition beanDefinition, Element propertityElement) {
        String name = propertityElement.attributeValue("name");
        String value = propertityElement.attributeValue("value");
        String ref = propertityElement.attributeValue("ref");

        PropertyDefiniton propertyDefiniton = new PropertyDefiniton(name);
        if (null != value) {
            ValueDefiniton valueDefiniton = new ValueDefiniton(value);
            propertyDefiniton.setValue(valueDefiniton);
        } else if (null != ref) {
            RefDefinition refDefinition = new RefDefinition(ref);
            propertyDefiniton.setValue(refDefinition);
        }else {
            return;
        }
        beanDefinition.addPropertyDefinitonList(propertyDefiniton);
    }


    /**
     * 生成document
     * @param inputStream
     * @return
     */
    private Document createDocument(InputStream inputStream) {
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read(inputStream);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return document;
    }

}
