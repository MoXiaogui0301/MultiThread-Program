package multithread.chapter4.demo15LockMethodisHeldByCurrentThread;

/**
 * P225
 * ReentrantLock.isHeldByCurrentThread()方法查询当前线程是否保持此锁定
 *
 * Result:
 * lock is held by current thread?false
 * lock is held by current thread?true
 */
public class Run {
    public static void main(String[] args) {
        final Service service1 = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service1.serviceMethod();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
