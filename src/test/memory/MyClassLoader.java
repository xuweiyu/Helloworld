package test.memory;

import java.io.*;

class MyClassLoader extends ClassLoader {
    private String classLoaderName = "";//标识性作用，只是为了区分多个ClassLoader对象
    private final String fileExtend = ".class";//文件后缀
    private String path;

    public void setPath(String path) {
        this.path = path;
    }

    public MyClassLoader(String classLoaderName) {
        super();//使用默认的SystemClassLoader作为双亲classLoader
        this.classLoaderName = classLoaderName;
    }

    public MyClassLoader(ClassLoader parentClassLoader, String classLoaderName) {
        super(parentClassLoader);//显示指定双亲classLoader
        this.classLoaderName = classLoaderName;
    }

    /**
     * 根据指定的二进制名字寻找这个类，会被loadClass调用，而且是检查完父类加载器之后
     * ClassLoader的findClass仅仅只是抛出一个异常而已，并没有什么具体的实现，所以
     * 我们要自定义ClassLoader必须重新findClass
     *
     * @param name
     * @return
     * @throws ClassNotFoundException
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("findClass class name = "+name);
        byte[] data = loadClassData(name);
        //将一个字节数组转换为一个class的实例，在转换之前这个类必须要被解析
        return defineClass(name, data, 0, data.length);
    }

    public byte[] loadClassData(String classname) {
        InputStream inputStream = null;
        byte[] data = null;
        ByteArrayOutputStream outputStream = null;
        //将classname的.换成/
        classname = classname.replace(".","/");
        try {
            //获取一个全路径
            inputStream = new FileInputStream(new File(path + classname + fileExtend));
            outputStream = new ByteArrayOutputStream();
            int ch;
            while (-1 != (ch = inputStream.read())) {
                outputStream.write(ch);
            }
            data = outputStream.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }
}

