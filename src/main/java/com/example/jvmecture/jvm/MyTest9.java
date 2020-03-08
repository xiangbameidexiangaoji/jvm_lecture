package com.example.jvmecture.jvm;

public class MyTest9 {
    public static void main(String[] args) throws Exception {

        ClassLoader loader = ClassLoader.getSystemClassLoader();

        Class<?> aClass = loader.loadClass("com.example.jvmecture.jvm.CL");
        System.out.println(aClass);

        System.out.println("------------");

        aClass = Class.forName("com.example.jvmecture.jvm.CL");
        System.out.println(aClass);
    }
}

class CL {
    static {
        System.out.println("Class CL");
    }
}
