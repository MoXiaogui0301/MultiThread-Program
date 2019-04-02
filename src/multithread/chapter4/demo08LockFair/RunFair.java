package multithread.chapter4.demo08LockFair;

/**
 * P217
 * 公平锁：线程获取锁的顺序大体按照线程加锁的顺序来分配的，基本满足FIFO顺序
 *
 * Result:
 * *线程Thread-4运行了
 * *线程Thread-2运行了
 * *线程Thread-0运行了
 * *线程Thread-1运行了
 * *线程Thread-3运行了
 * ThreadName=Thread-2获得锁定
 * ThreadName=Thread-1获得锁定
 * ThreadName=Thread-4获得锁定
 * ThreadName=Thread-3获得锁定
 * ThreadName=Thread-0获得锁定
 *
 * 实际情况随机性较大，对结果存疑
 *
 */
public class RunFair {
    public static void main(String[] args) {
        final Service service = new Service(true);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("*线程" + Thread.currentThread().getName() + "运行了");
                service.serviceMethod();
            }
        };

        Thread[] threadArray = new Thread[5];

        for (int i=0; i<5; i++)    {
            threadArray[i] = new Thread(runnable);
        }

        for (int i=0; i<5; i++)    {
            threadArray[i].start();
        }
    }
}
