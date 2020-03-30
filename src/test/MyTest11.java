package test;

public class MyTest11 {
    static {
        System.out.println("MyTest11 init");
    }
    public static void main(String[] args) {
        System.out.println(Child11.a);
        System.out.println("=======");
        Child11.doSomeThing();
    }
}
class Parent11 {
    public static int a = 3;
    static {
        System.out.println("Parent11 init");
    }
    public static void doSomeThing(){
        System.out.println("Parent11 do someThing");
    }
}
class Child11 extends Parent11 {
    static {
        System.out.println("Parent11 init");
    }
}
