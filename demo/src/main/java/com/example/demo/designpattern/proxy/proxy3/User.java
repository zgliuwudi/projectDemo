package com.example.demo.designpattern.proxy.proxy3;

/**
 * @ClassName: User
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-21 23:35
 * @Version: 1.0
 **/
public class User {

    private Integer id;
    private String name;
    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
