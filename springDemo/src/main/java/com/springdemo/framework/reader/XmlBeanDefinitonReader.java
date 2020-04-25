package com.springdemo.framework.reader;

import com.springdemo.framework.register.BeanDefinitonRegister;
import com.springdemo.framework.util.DocumentReader;
import org.dom4j.Document;

import java.io.InputStream;

/**
 * @ClassName: XmlBeanDefinitonReader
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-11 07:27
 * @Version: 1.0
 **/
public class XmlBeanDefinitonReader {
    private BeanDefinitonRegister beanDefinitonRegister;

    public XmlBeanDefinitonReader(BeanDefinitonRegister beanDefinitonRegister) {
        this.beanDefinitonRegister = beanDefinitonRegister;
    }

    public void loadBeanDefinition(InputStream inputStream){
        Document document = DocumentReader.createDocument(inputStream);
        if (null == document) {
            return;
        }
        XmlBeanDocumentReader documentReader = new XmlBeanDocumentReader(beanDefinitonRegister);
        documentReader.parseDocument(document.getRootElement());
    }

}
