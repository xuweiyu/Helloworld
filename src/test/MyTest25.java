package test;

public class MyTest25 implements Runnable{
    private Thread thread;
    public MyTest25(){
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        ClassLoader loader = thread.getContextClassLoader();
        thread.setContextClassLoader(loader);
        System.out.println("Class: " + loader.getClass());
        System.out.println("Parent Class: " + loader.getParent().getClass());
    }
    public static void main(String[] args) {
        new MyTest25();
    }
}
