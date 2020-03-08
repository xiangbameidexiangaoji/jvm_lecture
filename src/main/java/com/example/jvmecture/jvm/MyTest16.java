package com.example.jvmecture.jvm;

public class MyTest16 {
    public static void main(String[] args) throws ClassNotFoundException {
        MyTest12 loader1 = new MyTest12("loader1");
        loader1.setPath("C:/Users/李涵林/Desktop/");
        Class<?> clazz = loader1.loadClass("com.example.jvmecture.jvm.MyTest1");
        
        System.out.println("class:" + clazz.hashCode());
        System.out.println("class loader:" + clazz.getClassLoader());//null
    }
}
