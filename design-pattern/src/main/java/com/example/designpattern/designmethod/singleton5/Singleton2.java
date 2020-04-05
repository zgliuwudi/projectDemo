package com.example.designpattern.designmethod.singleton5;

/**
 * @ClassName: Singleton2
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 23:16
 * @Version: 1.0
 **/
public class Singleton2 {

    private static volatile Singleton2 singleton2;

    private Singleton2() {
        if (null != singleton2) {
            System.out.println("有人攻击");
        }
    }

    public static Singleton2 getInstance() {
        // 不加 volatile 会导致有线程在执行 new Singleton2() 时候，使用类指令重排
        // 一个cpu已经引用地址分配了，另外一个cpu还么有执行完初始化，导致singleton2不是null但是还未new完
        // 直接返回对象了
        if (null == singleton2) {
            // synchronized直接加到方法上，性能太差，上方增加一个null的判断
            synchronized (Singleton2.class) {
                // 如果不增加null的判断，两个同时在等待锁的线程，
                // 容易上一个线程已经new成功了，出去了，这个线程刚获取到锁进入了，又new了一遍
                if (null == singleton2) {
                    // 是多步骤完成多new操作，会发生指令重排
                    singleton2 = new Singleton2();
                    return singleton2;
                }
            }
        }
        return singleton2;
    }
}
