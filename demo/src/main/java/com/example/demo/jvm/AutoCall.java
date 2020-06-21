package com.example.demo.jvm;

/**
 * @ClassName: AutoCall
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-05-16 22:46
 * @Version: 1.0
 **/
public class AutoCall {

    public static void main(String[] args) {
        Father father = new Son();
        father.f1();
        char a = 'a';
        father.f1(a);
    }
}

class Father {
    public void f1(){
        System.out.println("father f1");
    }

    public void f1(int i){
        System.out.println("father f1 int");
    }
}

class Son extends Father{
    public void f1(){
        System.out.println("son f1");
    }

    public void f1(char i){
        System.out.println("son f1 char");
    }
}
