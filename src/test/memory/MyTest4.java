package test.memory;

/**
 * 方法区产生内存溢出
 */
public class MyTest4 {
    public static void main(String[] args) {
        for (;;){
            MyClassLoader loader = new MyClassLoader("loader");
            loader.setPath("/Users/apple/Desktop/");
            try {
                loader.loadClass("test.memory.MyName");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
