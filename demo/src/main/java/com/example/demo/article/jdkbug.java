package com.example.demo.article;

/**
 * @ClassName: jdkbug
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-03-15 18:34
 * @Version: 1.0
 **/
public class jdkbug {

    public void test() {
        int i = 8;
        while ((i -= 3) > 0);
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        jdkbug hello = new jdkbug();
        for (int i = 0; i < 50_000; i++) {
            hello.test();
        }
    }

}
