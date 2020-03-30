package test;

public class Loader {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz1 = Class.forName("java.lang.String");
        System.out.println(clazz1.getClassLoader());
        Class clazz2 = Class.forName("test.C");
        System.out.println(clazz2.getClassLoader());
    }
}
class C{

}
