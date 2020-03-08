package com.example.jvmecture.jvm;

public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild.str);
    }
}

class MyParent {
    public static String str = "hello world";

    static {
        System.out.println("MyParent static block");
    }
}

class MyChild extends MyParent {
    public static String str2 = "welcome";

    static {
        System.out.println("MyChild static block");
    }
}
