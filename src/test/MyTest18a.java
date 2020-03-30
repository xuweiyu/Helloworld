package test;

public class MyTest18a {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader classLoader = new MyClassLoader("loader1");
        classLoader.setPath("/Users/apple/Desktop/");
        Class clazz = classLoader.loadClass("test.MySample");
        System.out.println("clazz = " + clazz.getClassLoader());
    }
}
