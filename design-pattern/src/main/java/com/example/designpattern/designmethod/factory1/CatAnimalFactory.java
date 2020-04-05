package com.example.designpattern.designmethod.factory1;

/**
 * @ClassName: CatAnimalFactory
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 20:56
 * @Version: 1.0
 **/
public class CatAnimalFactory extends AnimalFactory{
    @Override
    Animal createAnimal() {
        return new Cat();
    }
}
