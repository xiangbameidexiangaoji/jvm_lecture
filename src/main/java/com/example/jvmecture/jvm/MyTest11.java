package com.example.jvmecture.jvm;


import java.net.URL;
import java.util.Enumeration;

public class MyTest11 {
    public static void main(String[] args) throws Exception {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();

        String resourceName = "com/example/jvmecture/jvm/MyTest10.class";

        Enumeration<URL> urls = contextClassLoader.getResources(resourceName);

        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            System.out.println(url);
        }
    }
}
