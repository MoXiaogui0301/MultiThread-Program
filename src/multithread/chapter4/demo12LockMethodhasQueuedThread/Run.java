package multithread.chapter4.demo12LockMethodhasQueuedThread;

/**
 * P222
 * 验证ReentrantLock的hasQueuedThread()和hasQueuedThreads()方法
 * 查询指定的线程是否正在等待获取此锁定
 *
 * Result:
 * thread A is queueing?false
 * thread B is queueing?true
 * any thread is queueing?true
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread threadA = new Thread(runnable);
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.start();
        Thread.sleep(500);
        System.out.println("thread A is queueing?" + service.lock.hasQueuedThread(threadA));
        System.out.println("thread B is queueing?" + service.lock.hasQueuedThread(threadB));
        System.out.println("any thread is queueing?" + service.lock.hasQueuedThreads());
    }
}
