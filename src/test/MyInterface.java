package test;

public class MyInterface {
    public static void main(String[] args) {
        System.out.println(Child1.thread);
    }
}

interface Parent1 {
    public static Thread thread1 = new Thread() {
        {
            System.out.println("parent");
        }
    };
}

class Child1 implements Parent1 {
    public static Thread thread = new Thread() {
        {
            System.out.println("child");
        }
    };
}
