package com.example.jvmecture.jvm;

/**
 * 类加载器实战剖析与疑难点解析
 */
public class MyTest15 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
