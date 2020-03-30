package test.bytecode;

import java.io.*;
import java.net.ServerSocket;

public class MyTest3 {
    public void test() {
        try {
            InputStream inputStream = new FileInputStream("test.txt");
            ServerSocket serverSocket = new ServerSocket(9999);
            serverSocket.accept();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } catch (Exception e) {
        } finally {
            System.out.println("finally exe");
        }
    }
}
