package test.memory;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class MyTest1 {
    public static void main(String[] args) {
        List<MyTest1> list = new ArrayList<>();

//        MyClassLoader loader1 = new MyClassLoader("loader1");
//        MyClassLoader loader2 = new MyClassLoader(loader1, "loader2");
        for (; ; ) {
            list.add(new MyTest1());
        }
    }
}

