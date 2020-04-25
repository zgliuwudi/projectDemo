package com.springdemo.framework.reader;

import com.springdemo.framework.register.BeanDefinitonRegister;
import com.springdemo.framework.ioc.BeanDefinition;
import com.springdemo.framework.ioc.PropertyDefiniton;
import com.springdemo.framework.ioc.RefDefinition;
import com.springdemo.framework.ioc.ValueDefiniton;
import org.dom4j.Element;

import java.util.List;

/**
 * @ClassName: XmlBeanDocumentReader
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-11 08:37
 * @Version: 1.0
 **/
public class XmlBeanDocumentReader {
    private BeanDefinitonRegister beanDefinitonRegister;

    public XmlBeanDocumentReader(BeanDefinitonRegister beanDefinitonRegister) {
        this.beanDefinitonRegister = beanDefinitonRegister;
    }


    public void parseDocument(Element rootElement) {
        paresBeanDocument(rootElement);
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
        beanDefinitonRegister.registerBeanDefinition(id, beanDefinition);
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
}
