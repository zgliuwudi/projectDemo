package com.springdemo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName: UserData
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-05 08:46
 * @Version: 1.0
 **/
@Data
public class UserData {

    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

}
