package com.example.jvmecture.jvm;

public class MyTest5 {

    public static void main(String[] args){
        System.out.println(MyChild5.b);
    }
}
interface MyParent5 {
    int a = 5;
}
interface MyChild5 extends MyParent5 {
    int b = 6;
}