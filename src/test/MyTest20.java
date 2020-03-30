package test;

import java.lang.reflect.Method;

public class MyTest20 {
    public static void main(String[] args) throws Exception {
        MyClassLoader loader1 = new MyClassLoader("loader1");
        MyClassLoader loader2 = new MyClassLoader("loader2");
        Class clazz1 = loader1.loadClass("test.MyPerson");
        Class clazz2 = loader2.loadClass("test.MyPerson");
        Object o1 = clazz1.newInstance();
        Object o2 = clazz2.newInstance();
        Method method = clazz1.getMethod("setPerson",Object.class);
        method.invoke(o1,o2);
    }
}
