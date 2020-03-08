package com.example.jvmecture.jvm;

public class MyTest2 {

    public static void main(String[] args) {
        System.out.println(MyParent2.c);
    }
}

class MyParent2 {

    public static final String str = "hello world";

    public static final short s = 10;

    public static final int i = 100;

    public static final int c = 0;

    static {
        System.out.println("MyParent2 static block");
    }
}