package multithread.chapter4.demo16LockMethodisLocked;

/**
 * P226
 * ReentrantLock.isLocked()查询此锁是否由任意线程保持
 *
 * Result:
 * lock is locked? false
 * lock is locked? true
 *
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service(true);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
