package com.example.jvmecture.jvm;

public class MyTest7 {
    
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("java.lang.String");
        System.out.println(aClass.getClassLoader());

        Class<?> demo = Class.forName("com.example.jvmecture.jvm.Demo");
        System.out.println(demo.getClassLoader());
    }

}

class Demo {
    
}