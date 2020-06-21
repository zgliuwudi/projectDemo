package com.example.demo.jvm;

/**
 * @ClassName: StringTrueOrFalseTest
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-05-13 23:55
 * @Version: 1.0
 **/
public class StringTrueOrFalseTest {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1 == str2);
        String str3 = new String("abc");
        System.out.println(str3 == str2);
        String str4 = "a" + "b";
        System.out.println(str4 == "ab");
        final String s = "a";
        String str5 = s + "b";
        System.out.println(str5 == "ab");
        String s1 = "a";
        String s2 = "b";
        String str6 = s1 + s2;
        System.out.println(str6 == "ab");
        String str7 = "abc".substring(0,2);
        System.out.println(str7 == "ab");
        String str8 = "abc".toUpperCase();
        System.out.println(str8 == "ABC");
        String s5 = "a";
        String s6 = "abc";
        String s7 = s5 + "bc";
        System.out.println(s6 == s7.intern());

        System.out.println("--------------------");

//        String f = new String("abs") + new String("tract");
//        String f = new String("ja") + new String("va");
//        System.out.println(f.intern() == f);

        String a = "hello";
        String b = new String("hello");
        System.out.println(a == b);
        String c = "world";
        System.out.println(c.intern() == c);
        String d = new String("mike");
        System.out.println(d.intern() == d);
        String e = new String("jo") + new String("hn");
        System.out.println(e.intern() == e);
        String f = new String("ja") + new String("va");
        System.out.println(f.intern() == f);

//        String s = new String("1");
//        s.intern();
//        String s2 = "1";
//        System.out.println(s == s2);
//        String s3 = new String("1") + new String("1");
//        s3.intern(); String s4 = "11"; System.out.println(s3 == s4);
    }
}
