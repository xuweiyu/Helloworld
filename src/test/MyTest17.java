package test;

public class MyTest17 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //默认将应用类加载器作为它的父类加载器
        MyClassLoader classLoader = new MyClassLoader("loader1");
        Class clazz = classLoader.loadClass("test.MySample");
        System.out.println("clazz = " + clazz);
        Object o = clazz.newInstance();
    }
}
