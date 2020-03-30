package test;

public class MyTest9 {
    static {
        System.out.println("MyTest9 init");
    }
    public static void main(String[] args) {
        System.out.println(Child9.a);
    }
}
class Parent9 {
    static {
        System.out.println("Parent9 init");
    }
}
class Child9 extends Parent9 {
    public static int a = 3;
    static {
        System.out.println("Child9 init");
    }
}
