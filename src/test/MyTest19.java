package test;

import com.sun.crypto.provider.AESKeyGenerator;

public class MyTest19 {
    public static void main(String[] args) {
        AESKeyGenerator generator = new AESKeyGenerator();
        System.out.println(generator.getClass().getClassLoader());
    }
}
