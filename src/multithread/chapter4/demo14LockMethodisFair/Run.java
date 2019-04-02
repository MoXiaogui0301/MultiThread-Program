package multithread.chapter4.demo14LockMethodisFair;

/**
 * P224
 * ReentrantLock.isFair()方法，判断是否公平锁
 *
 * Result:
 * Thread-0公平锁情况:true
 * Thread-1公平锁情况:false
 *
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

        final Service service2 = new Service(false);
        runnable = new Runnable() {
            @Override
            public void run() {
                service2.serviceMethod();
            }
        };
        thread = new Thread(runnable);
        thread.start();
    }
}
