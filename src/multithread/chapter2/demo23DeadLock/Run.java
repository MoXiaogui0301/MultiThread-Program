package multithread.chapter2.demo23DeadLock;

/**
 * P105
 * 演示死锁
 * th1和th2两个线程分别占有锁lock1和lock2，然后同时申请lock2和lock1，出现死锁
 *
 * Result:
 * username=a
 * username=b
 */

public class Run {
    public static void main(String[] args) {
        try {
            DealThread t1 = new DealThread();
            t1.setFlag("a");
            Thread th1 = new Thread(t1);
            th1.start();
            Thread.sleep(100);
            t1.setFlag("b");
            Thread th2 = new Thread(t1);
            th2.start();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
