package multithread.chapter4.demo13LockMethodhasWaiters;

/**
 * P223
 * ReentrantLock的hasWaiters()方法
 *
 * Result:
 * 是否有线程正在等待newCondition? true 线程数是多少？10
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
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
        service.notifyMethod();
    }
}
