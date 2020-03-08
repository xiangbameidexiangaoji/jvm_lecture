//package com.example.jvmecture.jvm;
//
//import java.lang.reflect.Constructor;
//
//public class MySingletonDemo {
//
//    private static int count = 0;
//    //1、构造方法私有化
//    private MySingletonDemo(){
//        //在方法构建时，count ++
//        if(count > 0){
//            throw new RuntimeException();
//        }
//        count ++;
//    };
//    //2、提供一个 static 属性，该属性指向对象
//    private static MySingletonDemo mySingletonDemo;
//
//    //3、提供一个全局访问点
//    public static MySingletonDemo mySingletonDemo(){
//        if(mySingletonDemo == null){
//            mySingletonDemo = new MySingletonDemo();
//        }
//        return mySingletonDemo;
//
//    }
//
//    public static void main(String[] args) throws Exception {
//        ClassLoader classLoader = MySingletonDemo.class.getClassLoader();
//        Class<?> aClass = classLoader.loadClass("com.example.jvmecture.jvm.MySingletonDemo");
//        Constructor<?> constructor1 = aClass.getDeclaredConstructor(null);
//        constructor1.setAccessible(true);
//        Object o = constructor1.newInstance();
//        System.out.println(o);
//        Class<?> aClass1 = Class.forName("com.example.jvmecture.jvm.MySingletonDemo");
//        Constructor<?> constructor = aClass1.getDeclaredConstructor(null);
//        constructor.setAccessible(true);
//        Object o1 = constructor.newInstance();
//        System.out.println(o1);
//    }
//}
