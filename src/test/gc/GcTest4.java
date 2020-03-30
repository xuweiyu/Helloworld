package test.gc;

/**
 * -verbose:gc
 * -Xms200m
 * -Xmx200M
 * -Xmn50M
 * -XX:TargetSurvivorRatio=60
 * -XX:+PrintTenuringDistribution
 * -XX:+PrintGCDetails
 * -XX:+PrintGCTimeStamps
 * -XX:+UseConcMarkSweepGC
 * -XX:+UseParNewGC
 * -XX:MaxTenuringThreshold=3
 */
public class GcTest4 {
    public static void main(String[] args) throws InterruptedException {
        int size = 512 * 1024;//500k
        byte[] myAlloc1 = new byte[size];
        byte[] myAlloc2 = new byte[size];

        myGc();
        Thread.sleep(1000);
        System.out.println("111111111");

        myGc();
        Thread.sleep(1000);
        System.out.println("222222222");

        myGc();
        Thread.sleep(1000);
        System.out.println("333333333");

        myGc();
        Thread.sleep(1000);
        System.out.println("444444444");

        byte[] myAlloc3 = new byte[2 * size];
        byte[] myAlloc4 = new byte[2 * size];
        byte[] myAlloc5 = new byte[2 * size];

        myGc();
        Thread.sleep(1000);
        System.out.println("555555555");

        myGc();
        Thread.sleep(1000);
        System.out.println("666666666");

        System.out.println("hello world");
    }

    private static void myGc() {
        for (int i = 0; i < 40; i++) {
            byte[] bytes = new byte[1024 * 1024];
        }
    }
}
