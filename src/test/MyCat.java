package test;

public class MyCat {
    public MyCat() {
        System.out.println("MyCat is loaded by:" + MyCat.class.getClassLoader());
    }
}
