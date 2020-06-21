package com.example.demo.jvm;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @ClassName: ClassloaderTest
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-05-12 00:36
 * @Version: 1.0
 **/
public class ClassloaderTest {

    public static void main(String[] args) {
        try {
            URL url = new File("/tmp").toURI().toURL();
            URL[] urls = new URL[]{url};
            ClassLoader classLoader = new URLClassLoader(urls);
            classLoader.loadClass("com.example.demo.jvm.ClassloaderTest");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
