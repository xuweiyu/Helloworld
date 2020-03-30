package test;


import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

public class MyTest26 {
    public static void main(String[] args) {
        //将当前线程类加载器设置为它的父类加载器
        Thread.currentThread().setContextClassLoader(Thread.currentThread().getContextClassLoader().getParent());
        ServiceLoader serviceLoader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator =  serviceLoader.iterator();
        while (iterator.hasNext()){
            Driver driver = iterator.next();
            System.out.println("driver = "+driver.getClass()+",loader = "+driver.getClass().getClassLoader());
        }
        System.out.println("当前线程上下文类加载器是：" +Thread.currentThread().getContextClassLoader());
        System.out.println("serviceLoader的类加载器是："+ServiceLoader.class.getClassLoader());
    }
}
