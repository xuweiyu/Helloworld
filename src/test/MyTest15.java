package test;

public class MyTest15 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader loader = new NetWorkClassLoader();
        Object cat = loader.loadClass("Cat").newInstance();
    }
}

class NetWorkClassLoader extends ClassLoader{
    public Class findClass(String name){
        byte[] bytes = loadClassDta(name);
        //逻辑
        return defineClass(bytes);
    }
    public byte[] loadClassDta(String name){
        byte[] bytes = null;
        //逻辑
        return bytes;
    }
    public Class defineClass(byte[] bytes){
        return null;
    }
}
