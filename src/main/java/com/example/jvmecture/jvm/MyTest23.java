package com.example.jvmecture.jvm;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

public class MyTest23 {
    public static void main(String[] args) {
        //设置为当前类的父加载器，EXT 进行加载
//        Thread.currentThread().setContextClassLoader(MyTest23.class.getClassLoader().getParent());
        ServiceLoader<Driver> serviceLoader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = serviceLoader.iterator();
        while(iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println("driver: " + driver.getClass() + ",loader: " + driver.getClass().getClassLoader());
        }
        System.out.println("当前线程上下文类加载器: " + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器: " + ServiceLoader.class.getClassLoader());
    }
}
