package com.example.jvmecture.jvm;

public class MyTest4 {
    public static void main(String[] args){
//        MyParent4 myParent4 = new MyParent4();
        MyParent4[] m = new MyParent4[1];
        System.out.println(m.getClass()+"==="+m.getClass().getSuperclass());
        int[] i = new int[1];
    }
}

class MyParent4 {
    public static final String str = "1";
    
    static {
        System.out.println("MyParent4 static block");
    }
}