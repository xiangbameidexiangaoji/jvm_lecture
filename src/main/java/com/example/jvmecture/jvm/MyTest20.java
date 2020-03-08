package com.example.jvmecture.jvm;

import org.springframework.stereotype.Repository;

@Repository
public class MyTest20 {
    public static void main(String[] args){
        System.out.println(System.getProperty("sun.boot.class.path"));  //启动类
        System.out.println(System.getProperty("java.ext.dirs"));        //扩展类
        System.out.println(System.getProperty("java.class.path"));      //应用类
        ClassLoader.getSystemClassLoader();
    }
}
