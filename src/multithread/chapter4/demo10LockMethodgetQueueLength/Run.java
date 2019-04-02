package multithread.chapter4.demo10LockMethodgetQueueLength;

/**
 * P219
 * Lock类的getQueueLength()方法，返回当前有多少个线程等待获取锁lock
 *
 * Result:
 * ThreadName=Thread-1 进入方法！
 * 有9个线程等待获取锁！
 * 有9个线程等待获取锁！
 * ThreadName=Thread-6 进入方法！
 * 有8个线程等待获取锁！
 * ThreadName=Thread-7 进入方法！
 * 有7个线程等待获取锁！
 * ThreadName=Thread-3 进入方法！
 * 有6个线程等待获取锁！
 * ThreadName=Thread-5 进入方法！
 * 有5个线程等待获取锁！
 * ThreadName=Thread-2 进入方法！
 * 有4个线程等待获取锁！
 * ThreadName=Thread-0 进入方法！
 * 有3个线程等待获取锁！
 * ThreadName=Thread-4 进入方法！
 * 有2个线程等待获取锁！
 * ThreadName=Thread-8 进入方法！
 * 有1个线程等待获取锁！
 * ThreadName=Thread-9 进入方法！
 * 有0个线程等待获取锁！
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
            }
        };

        Thread[] threadArray = new Thread[10];

        for (int i=0; i<10; i++)    {
            threadArray[i] = new Thread(runnable);
        }

        for (int i=0; i<10; i++)    {
            threadArray[i].start();
        }

        Thread.sleep(2000);
        System.out.println("有" + service.lock.getQueueLength() + "个线程等待获取锁！");
    }
}
