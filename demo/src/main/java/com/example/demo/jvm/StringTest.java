package com.example.demo.jvm;

/**
 * @ClassName: StringTest
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-05-01 10:57
 * @Version: 1.0
 **/
public class StringTest {

    private String s1 = "JVM原理";
    private String s2 = "JVM原理";
    private String s3 = "JVM原理";
    private String s4 = "JVM原理";

}

//Classfile /Users/daisy/java/github/projectDemo/demo/target/classes/com/example/demo/jvm/StringTest.class
//Last modified 2020-5-1; size 465 bytes
//        MD5 checksum 7f442c942dfb7e50ffb6386ff56cd948
//        Compiled from "StringTest.java"
//public class com.example.demo.jvm.StringTest
//        minor version: 0
//        major version: 52
//        flags: ACC_PUBLIC, ACC_SUPER
//        Constant pool:
//        #1 = Methodref          #8.#23         // java/lang/Object."<init>":()V
//        #2 = String             #24            // JVM原理
//        #3 = Fieldref           #7.#25         // com/example/demo/jvm/StringTest.s1:Ljava/lang/String;
//        #4 = Fieldref           #7.#26         // com/example/demo/jvm/StringTest.s2:Ljava/lang/String;
//        #5 = Fieldref           #7.#27         // com/example/demo/jvm/StringTest.s3:Ljava/lang/String;
//        #6 = Fieldref           #7.#28         // com/example/demo/jvm/StringTest.s4:Ljava/lang/String;
//        #7 = Class              #29            // com/example/demo/jvm/StringTest
//        #8 = Class              #30            // java/lang/Object
//        #9 = Utf8               s1
//        #10 = Utf8               Ljava/lang/String;
//        #11 = Utf8               s2
//        #12 = Utf8               s3
//        #13 = Utf8               s4
//        #14 = Utf8               <init>
//  #15 = Utf8               ()V
//          #16 = Utf8               Code
//          #17 = Utf8               LineNumberTable
//          #18 = Utf8               LocalVariableTable
//          #19 = Utf8               this
//          #20 = Utf8               Lcom/example/demo/jvm/StringTest;
//          #21 = Utf8               SourceFile
//          #22 = Utf8               StringTest.java
//          #23 = NameAndType        #14:#15        // "<init>":()V
//          #24 = Utf8               JVM原理
//          #25 = NameAndType        #9:#10         // s1:Ljava/lang/String;
//          #26 = NameAndType        #11:#10        // s2:Ljava/lang/String;
//          #27 = NameAndType        #12:#10        // s3:Ljava/lang/String;
//          #28 = NameAndType        #13:#10        // s4:Ljava/lang/String;
//          #29 = Utf8               com/example/demo/jvm/StringTest
//          #30 = Utf8               java/lang/Object
//          {
//public com.example.demo.jvm.StringTest();
//        descriptor: ()V
//        flags: ACC_PUBLIC
//        Code:
//        stack=2, locals=1, args_size=1
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: aload_0
//        5: ldc           #2                  // String JVM原理
//        7: putfield      #3                  // Field s1:Ljava/lang/String;
//        10: aload_0
//        11: ldc           #2                  // String JVM原理
//        13: putfield      #4                  // Field s2:Ljava/lang/String;
//        16: aload_0
//        17: ldc           #2                  // String JVM原理
//        19: putfield      #5                  // Field s3:Ljava/lang/String;
//        22: aload_0
//        23: ldc           #2                  // String JVM原理
//        25: putfield      #6                  // Field s4:Ljava/lang/String;
//        28: return
//        LineNumberTable:
//        line 11: 0
//        line 13: 4
//        line 14: 10
//        line 15: 16
//        line 16: 22
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0      29     0  this   Lcom/example/demo/jvm/StringTest;
//        }
//        SourceFile: "StringTest.java"
