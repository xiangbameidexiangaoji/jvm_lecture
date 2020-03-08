package com.example.jvmecture.jvm;

public class MyTest3 {
    
    public static void main(String[] args){
        System.out.println(MyParent3.str);
    }
}
class MyParent3 {
    
    public static final String str = "5";
    
    static {
        System.out.println("MyParent3 static code");
    }
}

