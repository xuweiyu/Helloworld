package test;

public class MyTest18 {
    public static void main(String[] args) {
        //启动类加载器所加载的类的路径
        System.out.println(System.getProperty("sun.boot.class.path"));
        //扩展类加载器所加载的类的路径
        System.out.println(System.getProperty("java.ext.dirs"));
        //自定义类加载器所加载的类的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
