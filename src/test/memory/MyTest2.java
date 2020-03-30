package test.memory;

/**
 * 演示栈溢出
 */
public class MyTest2 {
    private int length;

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();
        try {
            myTest2.test();
        } catch (Throwable throwable) {
            System.out.println(myTest2.getLength());
            throwable.printStackTrace();
        }
    }

    public int getLength() {
        return length;
    }

    public void test() {
        length++;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test();
    }
}
