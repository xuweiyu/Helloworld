package test;

import java.util.Random;

public class FinalTest {
    public static void main(String[] args) {
        System.out.println(A.a);
    }
}
class A {
    public static final int a = new Random().nextInt();
    static {
        System.out.println("class A init");
    }
}
