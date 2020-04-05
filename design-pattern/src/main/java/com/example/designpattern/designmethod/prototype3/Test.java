package com.example.designpattern.designmethod.prototype3;

/**
 * @ClassName: Test
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 22:17
 * @Version: 1.0
 **/
public class Test {

    @org.junit.Test
    public void test1() throws Exception {
        Demo demo = new Demo();
        demo.setName("hello");
        PrototypeDemo prototypeDemo1 = new PrototypeDemo(demo);
        System.out.println(prototypeDemo1.getDemo());
        PrototypeDemo prototypeDemo2 = (PrototypeDemo) prototypeDemo1.shallowClone();
        System.out.println(prototypeDemo2.getDemo());
        PrototypeDemo prototypeDemo3 = (PrototypeDemo) prototypeDemo1.deepClone();
        System.out.println(prototypeDemo3.getDemo());
    }
}
