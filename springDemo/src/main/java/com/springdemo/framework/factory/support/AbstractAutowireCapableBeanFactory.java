package com.springdemo.framework.factory.support;


import com.springdemo.framework.ioc.BeanDefinition;
import com.springdemo.framework.ioc.PropertyDefiniton;
import com.springdemo.framework.ioc.RefDefinition;
import com.springdemo.framework.ioc.ValueDefiniton;
import com.springdemo.framework.util.ReflectUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @ClassName: AbstractAutowireCapableBeanFactory
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-11 07:09
 * @Version: 1.0
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object getBeanByDefiniton(BeanDefinition beanDefinition) {
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
                }else if (value instanceof RefDefinition){
                    RefDefinition refDefinition = (RefDefinition) value;
                    valueNum = getBean(refDefinition.getRef());
                }else {

                }
                ReflectUtils.setProperty(bean,propertyDefiniton.getName(),valueNum);

            }
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
}
