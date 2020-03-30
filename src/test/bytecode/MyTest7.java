package test.bytecode;

public class MyTest7 {
    private void test(Animal1 animal) {
        System.out.println("动物测试");
        animal.sleep();
    }

    private void test(Dog1 dog) {
        System.out.println("狗测试");
        dog.sleep();
    }

    public static void main(String[] args) {
        MyTest7 myTest7 = new MyTest7();
        Animal1 animal1 = new Animal1();
        Animal1 animal2 = new Dog1();
        myTest7.test(animal1);
        myTest7.test(animal2);
    }
}

class Animal1 {
    public void sleep() {
        System.out.println("动物睡觉");
    }
}

class Dog1 extends Animal1 {
    public void sleep() {
        System.out.println("狗狗睡觉");
    }
}
