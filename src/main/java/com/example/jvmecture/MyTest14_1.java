package com.example.jvmecture;

import com.example.jvmecture.jvm.MyTest12;

public class MyTest14_1 {
    public static void main(String[] args) throws Exception {
        MyTest12 loader1 = new MyTest12("loader1");
        loader1.setPath("C:/Users/李涵林/Desktop/");
        Class<?> clazz = loader1.loadClass("com.example.jvmecture.jvm.MySample");
        System.out.println("class is hashCode: " + clazz.hashCode());

        Object object = clazz.newInstance();

    }
}
