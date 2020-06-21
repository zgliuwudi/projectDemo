package com.example.demo.jvm;

/**
 * @ClassName: TestString1
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-05-07 22:22
 * @Version: 1.0
 **/
public class TestString1 {

    public static void main(String[] args) {
        String str1 = "aaa";
        System.out.println(new String("aaa") == str1);
        System.out.println(new String("aaa") == str1.intern());

        String str2 = new String("jo")+new String("hn");
        System.out.println(str2.intern() == str2);

        String str3 = new String("ja")+new String("va");
        System.out.println(str3.intern() == str3);
    }
}
