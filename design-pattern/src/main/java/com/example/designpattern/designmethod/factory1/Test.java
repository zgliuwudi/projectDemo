package com.example.designpattern.designmethod.factory1;

/**
 * @ClassName: Test
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 20:57
 * @Version: 1.0
 **/
public class Test {

    @org.junit.Test
    public void test1(){
        AnimalFactory factory = new DogAnimalFactory();
        factory.createAnimal().eat();
    }
}
