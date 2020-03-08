package com.example.jvmecture.jvm;

import lombok.Setter;

import java.io.*;

public class MyTest12 extends ClassLoader{

    private String classLoaderName;

    private static final String fileExtension = ".class";
    @Setter
    private String path;

    public MyTest12(String classLoaderName){
        super();// 将系统类加载器作为当前类加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    public MyTest12(ClassLoader parent,String classLoaderName){
        super(parent);
        this.classLoaderName = classLoaderName;
    }
    public MyTest12(ClassLoader parent){
        super(parent);
    }
    @Override
    public String toString() {
        return "MyTest12{" +
                "classLoaderName='" + classLoaderName + '\'' +
                '}';
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        System.out.println("findClass invoked:" + className);
        System.out.println("class loader name:" + this.classLoaderName);

        byte[] data = this.loadClassData(className);
        return this.defineClass(className, data, 0, data.length);
    }

    private byte[] loadClassData(String name){
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;
        name = name.replace(".", "/");
        try {
            is = new FileInputStream(new File(this.path + name + this.fileExtension));
            baos = new ByteArrayOutputStream();
            int ch  = 0;
            while ((ch = is.read()) != -1){
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        this.classLoaderName = this.classLoaderName.replace(".", "/");

        return data;
    }
    public static void main(String[] args) throws Exception {
        MyTest12 loader = new MyTest12("loader");
//        loader.setPath("E:/ideaworkspace/jvm_lecture/target/classes/");
        loader.setPath("C:/Users/李涵林/Desktop/");
        Class<?> clazz = loader.loadClass("com.example.jvmecture.jvm.MyTest1");
        System.out.println("class:" + clazz.hashCode());

        Object object = clazz.newInstance();
        System.out.println(object);
        System.out.println( );

        MyTest12 loader2 = new MyTest12(loader,"loader2");
        loader2.setPath("C:/Users/李涵林/Desktop/");
        Class<?> clazz2 = loader2.loadClass("com.example.jvmecture.jvm.MyTest1");
        System.out.println("class:"+clazz2.hashCode());
        Object o = clazz2.newInstance();
        System.out.println(o);


        System.out.println();

    }
}
