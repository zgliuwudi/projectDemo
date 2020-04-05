package com.example.designpattern.designprinciple.principle1;

/**
 * @ClassName: CharDisplay
 * @program: projectDemo
 * @Description: 使用抽象类，方便扩展功能，不用改变原逻辑
 * @Author: admin
 * @Date: 2020-04-04 15:59
 * @Version: 1.0
 **/
public class CharDisplay {

    private AbstractChar abstractChar;

    public CharDisplay(AbstractChar abstractChar) {
        this.abstractChar = abstractChar;
    }

    public void display(){
        abstractChar.display();
    }
}
