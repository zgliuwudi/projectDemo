package com.springdemo.ioc;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: PropertyDefiniton
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-09 22:48
 * @Version: 1.0
 **/
public class PropertyDefiniton {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Object value;

    public PropertyDefiniton(String name) {
        this.name = name;
    }
}
