package test.bytecode;

public class MyTest5 {
    public void test(Grandpa grandpa){
        System.out.println("test grandpa");
    }
    public void test(Father father){
        System.out.println("test father");
    }
    public void test(Son son){
        System.out.println("test son");
    }

    public static void main(String[] args) {
        Grandpa g1 = new Father();
        Grandpa g2 = new Son();
        MyTest5 myTest5 = new MyTest5();
        myTest5.test(g1);
        myTest5.test(g2);
    }
}

class Grandpa{

}

class Father extends Grandpa{

}

class Son extends Father{

}
