package com.springdemo.ioc;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: BeanDefinition
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-09 22:46
 * @Version: 1.0
 **/
public class BeanDefinition {

    @Getter
    @Setter
    private String beanId;

    @Getter
    @Setter
    private String className;

    @Getter
    @Setter
    private String initMethod;

    @Getter
    @Setter
    private List<PropertyDefiniton> propertyDefinitonList = new ArrayList<>();

    public BeanDefinition(String beanId, String className) {
        this.beanId = beanId;
        this.className = className;
    }

    public void addPropertyDefinitonList(PropertyDefiniton propertyDefinitonList) {
        this.propertyDefinitonList.add(propertyDefinitonList);
    }
}
