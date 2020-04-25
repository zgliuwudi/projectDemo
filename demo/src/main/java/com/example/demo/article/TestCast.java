package com.example.demo.article;

/**
 * @ClassName: Cast
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-12 21:26
 * @Version: 1.0
 **/
public class TestCast {

    public static void main(String[] args) {

        TestCast cls = new TestCast();
        Class c = cls.getClass();
        System.out.println(c);

        Object obj = new A();
        B b1 = new B();
        b1.show();

        // casts object
        A a = new A();
        // *** 把a转化为了B类型，此处容易产生把b1转成A类型误解。***
        a = A.class.cast(b1);

        System.out.println(obj.getClass());
        System.out.println(b1.getClass());
        System.out.println(a.getClass());
    }

}

/**
 * Created by shengke on 2016/10/22.
 */
class A {
    public static void show() {
        System.out.println("Class A show() function");
    }
}

class B extends A {
    public static void show() {
        System.out.println("Class B show() function");
    }
}

