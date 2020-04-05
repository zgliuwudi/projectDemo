package com.example.designpattern.designmethod.prototype3;

import java.io.*;

/**
 * @ClassName: PrototypeDemo
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-04 22:13
 * @Version: 1.0
 **/
public class PrototypeDemo implements Cloneable, Serializable {

    private Demo demo;

    public PrototypeDemo(Demo demo) {
        this.demo = demo;
    }

    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    public Object shallowClone() throws CloneNotSupportedException {
        PrototypeDemo prototypeDemo = (PrototypeDemo) super.clone();
        return prototypeDemo;
    }

    /**
     * 深拷贝
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
        outputStream.writeObject(this);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return objectInputStream.readObject();
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }
}


class Demo implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}