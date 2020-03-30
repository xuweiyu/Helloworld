package test;


public class MyTest3 {
    public static void main(String[] args) throws Exception {
//        AA[] asa = new AA[10];
//        System.out.println(asa.getClass().getClassLoader());
        MyClassLoader loader1 = new MyClassLoader("loader1");
        loader1.setPath("/Users/apple/Desktop/");
        loader1.loadClass("test.AA");

        new IP();

    }
    static class IP{

    }
}
