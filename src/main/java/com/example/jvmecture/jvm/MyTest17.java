package com.example.jvmecture.jvm;

import com.sun.crypto.provider.AESKeyGenerator;

public class MyTest17 {
    public static void main(String[] args) {
        AESKeyGenerator aesKeyGenerator = new AESKeyGenerator();

        //sun.misc.Launcher$ExtClassLoader@681a9515
        System.out.println(aesKeyGenerator.getClass().getClassLoader());

        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(MyTest17.class.getClassLoader());
    }
}
