package com.test.mybatisplusdemo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Userdata {
    private Integer id;

    private String username;

    private Date birthday;

    private String sex;

    private String address;
}