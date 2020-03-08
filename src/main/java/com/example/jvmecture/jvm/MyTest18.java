package com.example.jvmecture.jvm;

import java.lang.reflect.Method;

public class MyTest18 {
    public static void main(String[] args) throws Exception {
        MyTest12 loader1 = new MyTest12("loader1");
        MyTest12 loader2 = new MyTest12("loader2");

        Class<?> clazz1 = loader1.loadClass("com.example.jvmecture.jvm.MyPerson");
        Class<?> clazz2 = loader2.loadClass("com.example.jvmecture.jvm.MyPerson");
        System.out.println(clazz1 == clazz2);//true

        Object object1 = clazz1.newInstance();
        Object object2 = clazz2.newInstance();

        Method method = clazz1.getMethod("setMyPerson", Object.class);
        method.invoke(object1, object2);

    }
}
