package com.example.designpattern.designprinciple.principle1;

/**
 * @ClassName: Test
 * @program: projectDemo
 * @Description: 开闭原则
 * @Author: admin
 * @Date: 2020-04-04 16:05
 * @Version: 1.0
 **/
public class Test {

    @org.junit.Test
    public void test1(){
        AbstractChar abstractChar = new BarChar();
        CharDisplay charDisplay1 = new CharDisplay(abstractChar);
        charDisplay1.display();
    }
}
