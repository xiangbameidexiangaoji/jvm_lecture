package com.example.jvmecture.jvm;

public class MyTest8 {
    public static void main(String[] args){
        System.out.println(FinalTest.a);
    }
}

class FinalTest {
    public static final int a = 3;
    
    static {
        System.out.println("FinalTest static block");
    }
}
