package com.example.designpattern.designmethod.factory1;

/**
 * @ClassName: DogAnimalFactory
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 20:57
 * @Version: 1.0
 **/
public class DogAnimalFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Dog();
    }
}
