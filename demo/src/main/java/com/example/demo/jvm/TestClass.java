package com.example.demo.jvm;

import java.util.UUID;

/**
 * @ClassName: TestClass
 * @program: projectDemo
 * @Description: 测试class常量池存放的内容
 * @Author: admin
 * @Date: 2020-05-23 12:51
 * @Version: 1.0
 **/
public class TestClass {

    private final String finalStr = "final_str";
    private static final String staticFinalStr = "static_final_str";
    private static  String staticStr = "static_str";

    public static void main(String[] args) {
        System.out.println(TestFather.str);
    }

}

class TestFather{
//    public static  String str = "aaaa";
//    public static final String str = "aaaa";
    public static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("test father");
    }
}
