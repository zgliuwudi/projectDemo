package com.example.demo.jvm;

/**
 * @ClassName: Human
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-05-16 22:29
 * @Version: 1.0
 **/
public abstract class Human {

    public void say(Human human){
        System.out.println("human");
    }

    public void say(Man man){
        System.out.println("man");
    }

    public void say(Women women){
        System.out.println("women");
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human women = new Women();
        man.say(man);
        women.say(women);
    }
}

class Man extends Human{

}

class Women extends Human {

}