package com.example.jvmecture.jvm;

public class MyTest10 {

    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        while (systemClassLoader != null){
            systemClassLoader = systemClassLoader.getParent();
            System.out.println(systemClassLoader);
        }
    }
}
