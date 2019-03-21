package multithread.chapter2.demo27ChangeLock;

/**
 * P115
 * 演示线程获得锁后改变锁，后面的线程取得锁异步执行
 *
 * Result:
 * A begin 1553158599206
 * B begin 1553158599257
 * A end 1553158601247
 * B end 1553158601262
 *
 * 拓展：
 * 如果注释main方法中的Thread.sleep(50);
 * 则A和B线程同步，因为两者争抢的锁仍是"123"
 * Result:
 * A begin 1553158767222
 * A end 1553158769266
 * B begin 1553158769268
 * B end 1553158771271
 *
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.setName("A");
        ThreadB b = new ThreadB(myService);
        b.setName("B");
        a.start();
//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        b.start();
    }
}
