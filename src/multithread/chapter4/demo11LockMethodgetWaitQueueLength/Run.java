package multithread.chapter4.demo11LockMethodgetWaitQueueLength;

/**
 * P221
 * Lock.getWaitQueueLength(condition)方法，返回等待condition.await的线程估计数
 *
 * Result:
 * 有10个线程正在等待newCondition
 * ...(程序无输出，但继续运行)
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
