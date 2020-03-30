package test;

public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(Cat2.thread);
    }
}

class Cat2 {
    static {
        System.out.println("Cat2 init");
    }

    public static final Thread thread = new Thread() {
        {
            System.out.println("thread init");
        }
    };
}
