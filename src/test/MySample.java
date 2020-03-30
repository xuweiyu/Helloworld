package test;

public class MySample {
    public MySample(){
        System.out.println("MySample is loaded by:" +MySample.class.getClassLoader());
        new MyCat();
        System.out.println("MySample from:" + MyCat.class);
    }
}
