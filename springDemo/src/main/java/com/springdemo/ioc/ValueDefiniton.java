package com.springdemo.ioc;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: ValueDefinitoon
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-09 23:03
 * @Version: 1.0
 **/
public class ValueDefiniton {

    @Getter
    @Setter
    private String value;

    public ValueDefiniton(String value) {
        this.value = value;
    }
}
