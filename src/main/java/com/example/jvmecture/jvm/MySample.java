package com.example.jvmecture.jvm;

public class MySample {

    public MySample() {
        System.out.println("MySample is loaded by: " + this.getClass().getClassLoader());
        new MyCat();
        System.out.println("from MySample :" + MyCat.class);
    }

}
