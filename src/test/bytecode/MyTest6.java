package test.bytecode;

public class MyTest6 {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        a1.sleep();
        a1 = new Dog();
        a1.sleep();
    }
}

class Animal {
    public void sleep() {
        System.out.println("动物睡觉");
    }
}

class Cat extends Animal {
    public void sleep() {
        System.out.println("猫睡觉");
    }
}

class Dog extends Animal {
    public void sleep() {
        System.out.println("狗睡觉");
    }
}
