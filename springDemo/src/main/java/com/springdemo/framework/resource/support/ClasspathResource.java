package com.springdemo.framework.resource.support;

import com.springdemo.framework.resource.Resource;

import java.io.InputStream;

/**
 * @ClassName: ClasspathResource
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-11 08:53
 * @Version: 1.0
 **/
public class ClasspathResource implements Resource {
    private String location;

    public ClasspathResource(String location) {
        this.location = location;
    }

    @Override
    public InputStream getResource() {
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(location);
        return inputStream;
    }
}
