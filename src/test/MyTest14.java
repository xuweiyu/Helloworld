package test;


import java.sql.DriverManager;

public class MyTest14 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = MyTest14.class;
        System.out.println(clazz.getClassLoader());
        Class strClazz = String.class;
        System.out.println(strClazz.getClassLoader());
    }
}
