package test.gc;

/**
 * -verbose:gc
 * -Xms20m
 * -Xmx20m
 * -Xmn10m
 * -XX:+UseSerialGC
 * -XX:PretenureSizeThreshold=字节数
 * -XX:+PrintGCDetails2
 * -XX:+PrintCommandLineFlags
 * -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=5
 * -XX:+PrintTenuringDistribution
 */
public class GcTest3 {
    public static void main(String[] args) {
        int size = 1024 * 1024;
        byte[] myAlloc1 = new byte[2 * size];
        byte[] myAlloc2 = new byte[2 * size];
        byte[] myAlloc3 = new byte[2 * size];
        byte[] myAlloc4 = new byte[2 * size];
    }
}
