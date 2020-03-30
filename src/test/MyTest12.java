package test;

public class MyTest12 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        Class clazz = loader.loadClass("test.CL");
        System.out.println(clazz);
        System.out.println("----");
        clazz.forName("test.CL");
        System.out.println(clazz);
    }
}
class CL{
    static {
        System.out.println("CL init");
    }
}
