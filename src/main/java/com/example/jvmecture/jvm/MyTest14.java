package com.example.jvmecture.jvm;

public class MyTest14 {
    public static void main(String[] args) throws Exception {
        MyTest12 loader1 = new MyTest12("loader1");
        Class<?> clazz = loader1.loadClass("com.example.jvmecture.jvm.MySample");
        System.out.println("class is hashCode: " + clazz.hashCode());

//        Object object = clazz.newInstance();

    }
}
