package test;

import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        Parent[] parents = new Parent[5];
        System.out.println(parents.getClass().getSuperclass());
    }
}
class Parent {
    static {
        System.out.println("parent welcome");
    }
}
