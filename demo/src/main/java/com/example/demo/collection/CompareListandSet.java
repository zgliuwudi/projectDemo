package com.example.demo.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: CompareListandSet
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-04-12 22:35
 * @Version: 1.0
 **/
public class CompareListandSet {

    /**
     * contains方法 set效率要好于list
     *
     * 输出：
     * false
     * 59
     * false
     * 0
     */
    @Test
    public void test1(){
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 10000000; i++) {
            list.add(i + "");
            set.add(i + "");
        }
        String key = "99999999";
        long start = System.currentTimeMillis();
        System.out.println(list.contains(key));
        long end1 = System.currentTimeMillis();
        System.out.println(end1-start);
        System.out.println(set.contains(key));
        long end2 = System.currentTimeMillis();
        System.out.println(end2-end1);

    }
}
