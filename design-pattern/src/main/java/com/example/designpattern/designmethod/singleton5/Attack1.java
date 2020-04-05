package com.example.designpattern.designmethod.singleton5;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @ClassName: Attack1
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 23:58
 * @Version: 1.0
 **/
public class Attack1 {

    @Test
    public void test1() throws Exception {
        // 如果不执行这一个方法，就只执行下边两个，不会在构造方法中输出和拦截
        Singleton2.getInstance();
        Constructor<Singleton2> constructor = Singleton2.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton2 singleton2 = constructor.newInstance();
        System.out.println(singleton2);
        Singleton2 singleton22 = constructor.newInstance();
        System.out.println(singleton22);
        System.out.println(singleton2==singleton22);
    }

    /**
     * 枚举本身有防止反射机制
     * @throws Exception
     */
    @Test
    public void test2() throws Exception {
        Constructor<Singleton3> constructor = Singleton3.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton3 singleton3 = constructor.newInstance();
        System.out.println(singleton3);
        Singleton3 singleton33 = constructor.newInstance();
        System.out.println(singleton33);
        System.out.println(singleton3==singleton33);
    }

    @Test
    public void test3() throws Exception {
        Constructor<Singleton4> constructor = Singleton4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton4 singleton4 = constructor.newInstance();
        System.out.println(singleton4);
        Singleton4 singleton44 = constructor.newInstance();
        System.out.println(singleton44);
        System.out.println(singleton4==singleton44);
    }

    @Test
    public void test4(){
        Singleton4 instace = Singleton4.getInstace();
        Singleton4 instace2 = Singleton4.getInstace();
        System.out.println(instace==instace2);
    }

    /**
     * 枚举里没有无参数构造器，有到只是string+int的构造器
     * java.lang.IllegalArgumentException: Cannot reflectively create enum objects  这是 newInstance的输出
     * @throws Exception
     */
    @Test
    public void test5() throws Exception {
        Constructor<Singleton3> constructor = Singleton3.class.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        constructor.newInstance();
    }


}
