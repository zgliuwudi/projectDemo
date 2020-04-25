package com.springdemo.framework.ioc;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: RefDefinition
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-09 23:04
 * @Version: 1.0
 **/
public class RefDefinition {

    @Getter
    @Setter
    private String ref;

    public RefDefinition(String ref) {
        this.ref = ref;
    }
}
