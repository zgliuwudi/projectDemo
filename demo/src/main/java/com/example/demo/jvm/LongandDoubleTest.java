package com.example.demo.jvm;

/**
 * @ClassName: LongandDoubleTest
 * @program: projectDemo
 * @Description: TODO
 * @Author: admin
 * @Date: 2020-05-01 10:48
 * @Version: 1.0
 **/
public class LongandDoubleTest {

    private long a = -6076574518398440533L;
    private long b = -6076574518398440533L;
    private long c = -6076574518398440533L;
    private double d = 10.1234567890D;
    private double e = 10.1234567890D;
    private double f = 10.1234567890D;

}

//daisydeMacBook-Pro:jvm daisy$ javap -v LongandDoubleTest
//        警告: 二进制文件LongandDoubleTest包含com.example.demo.jvm.LongandDoubleTest
//        Classfile /Users/daisy/java/github/projectDemo/demo/target/classes/com/example/demo/jvm/LongandDoubleTest.class
//Last modified 2020-5-1; size 542 bytes
//        MD5 checksum e24908abe4890823750be304f4bd260e
//        Compiled from "LongandDoubleTest.java"
//public class com.example.demo.jvm.LongandDoubleTest
//        minor version: 0
//        major version: 52
//        flags: ACC_PUBLIC, ACC_SUPER
//        Constant pool:
//        #1 = Methodref          #13.#31        // java/lang/Object."<init>":()V
//        #2 = Long               -6076574518398440533l
//        #4 = Fieldref           #12.#32        // com/example/demo/jvm/LongandDoubleTest.a:J
//        #5 = Fieldref           #12.#33        // com/example/demo/jvm/LongandDoubleTest.b:J
//        #6 = Fieldref           #12.#34        // com/example/demo/jvm/LongandDoubleTest.c:J
//        #7 = Double             10.123456789d
//        #9 = Fieldref           #12.#35        // com/example/demo/jvm/LongandDoubleTest.d:D
//        #10 = Fieldref           #12.#36        // com/example/demo/jvm/LongandDoubleTest.e:D
//        #11 = Fieldref           #12.#37        // com/example/demo/jvm/LongandDoubleTest.f:D
//        #12 = Class              #38            // com/example/demo/jvm/LongandDoubleTest
//        #13 = Class              #39            // java/lang/Object
//        #14 = Utf8               a
//        #15 = Utf8               J
//        #16 = Utf8               b
//        #17 = Utf8               c
//        #18 = Utf8               d
//        #19 = Utf8               D
//        #20 = Utf8               e
//        #21 = Utf8               f
//        #22 = Utf8               <init>
//  #23 = Utf8               ()V
//          #24 = Utf8               Code
//          #25 = Utf8               LineNumberTable
//          #26 = Utf8               LocalVariableTable
//          #27 = Utf8               this
//          #28 = Utf8               Lcom/example/demo/jvm/LongandDoubleTest;
//          #29 = Utf8               SourceFile
//          #30 = Utf8               LongandDoubleTest.java
//          #31 = NameAndType        #22:#23        // "<init>":()V
//          #32 = NameAndType        #14:#15        // a:J
//          #33 = NameAndType        #16:#15        // b:J
//          #34 = NameAndType        #17:#15        // c:J
//          #35 = NameAndType        #18:#19        // d:D
//          #36 = NameAndType        #20:#19        // e:D
//          #37 = NameAndType        #21:#19        // f:D
//          #38 = Utf8               com/example/demo/jvm/LongandDoubleTest
//          #39 = Utf8               java/lang/Object
//          {
//public com.example.demo.jvm.LongandDoubleTest();
//        descriptor: ()V
//        flags: ACC_PUBLIC
//        Code:
//        stack=3, locals=1, args_size=1
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: aload_0
//        5: ldc2_w        #2                  // long -6076574518398440533l
//        8: putfield      #4                  // Field a:J
//        11: aload_0
//        12: ldc2_w        #2                  // long -6076574518398440533l
//        15: putfield      #5                  // Field b:J
//        18: aload_0
//        19: ldc2_w        #2                  // long -6076574518398440533l
//        22: putfield      #6                  // Field c:J
//        25: aload_0
//        26: ldc2_w        #7                  // double 10.123456789d
//        29: putfield      #9                  // Field d:D
//        32: aload_0
//        33: ldc2_w        #7                  // double 10.123456789d
//        36: putfield      #10                 // Field e:D
//        39: aload_0
//        40: ldc2_w        #7                  // double 10.123456789d
//        43: putfield      #11                 // Field f:D
//        46: return
//        LineNumberTable:
//        line 11: 0
//        line 13: 4
//        line 14: 11
//        line 15: 18
//        line 16: 25
//        line 17: 32
//        line 18: 39
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0      47     0  this   Lcom/example/demo/jvm/LongandDoubleTest;
//        }
//        SourceFile: "LongandDoubleTest.java"

