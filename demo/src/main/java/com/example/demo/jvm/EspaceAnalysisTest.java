package com.example.demo.jvm;

/**
 * @ClassName: EspaceAnalysisTest
 * @program: projectDemo
 * @Description: 逃逸分析
 * @Author: admin
 * @Date: 2020-05-11 22:26
 * @Version: 1.0
 **/
public class EspaceAnalysisTest {

    /**
     * @Author wudi
     * @Description
     * 1、jps查看pid号
     * 2、jmap -histo pid
     *
     * -Xmx4G -Xms4G -XX:-DoEscapeAnalysis -XX:+PrintGCDetails
     *
     * -Xmx4G -Xms4G -XX:+DoEscapeAnalysis -XX:+PrintGCDetails
     *
     * @Date 22:33 2020-05-11
     * @Param [args]
     * @return void
     **/
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            alloc();
        }
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void alloc(){
        User user = new User();
    }

    static class User{

    }
}
