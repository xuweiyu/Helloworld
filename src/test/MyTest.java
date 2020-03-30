package test;


public class MyTest {
    public static void main(String[] args) {
        Instance instance = Instance.getInstance();
        System.out.println("a = " + instance.a);
        System.out.println("b = " + instance.b);
    }
}

class Instance {
    public static int a;
    private static Instance instance = new Instance();
    public static int b = 0;

    private Instance() {
        a++;
        b++;
    }

    public static Instance getInstance() {
        return instance;
    }
}
