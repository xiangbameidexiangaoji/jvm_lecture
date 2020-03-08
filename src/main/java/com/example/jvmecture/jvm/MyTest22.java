package com.example.jvmecture.jvm;

public class MyTest22 implements Runnable{
    private Thread thread;

    public MyTest22(){
        this.thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        ClassLoader classLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);
        System.out.println("class: " + classLoader.getClass());
        System.out.println("parent: " + classLoader.getParent().getClass());
    }
    public static void main(String[] args) {
        new MyTest22();
    }
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
}
