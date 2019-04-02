package multithread.chapter4.demo08LockFair;

/**
 * P218
 * 非公平锁，先start()的线程没有获取锁的优先权，极端情况可能存在启动的某个线程一直无法获得锁的现象
 *
 * Result:
 * *线程Thread-5运行啦
 * *线程Thread-8运行啦
 * *线程Thread-2运行啦
 * *线程Thread-6运行啦
 * *线程Thread-0运行啦
 * *线程Thread-1运行啦
 * *线程Thread-9运行啦
 * *线程Thread-7运行啦
 * *线程Thread-3运行啦
 * *线程Thread-4运行啦
 * ThreadName=Thread-8获得锁定
 * ThreadName=Thread-9获得锁定
 * ThreadName=Thread-6获得锁定
 * ThreadName=Thread-5获得锁定
 * ThreadName=Thread-1获得锁定
 * ThreadName=Thread-2获得锁定
 * ThreadName=Thread-0获得锁定
 * ThreadName=Thread-7获得锁定
 * ThreadName=Thread-3获得锁定
 * ThreadName=Thread-4获得锁定
 *
 */
public class RunNotFair {
    public static void main(String[] args) {
        final Service service = new Service(false);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("*线程" + Thread.currentThread().getName() + "运行啦");
                service.serviceMethod();
            }
        };

        Thread[] threadArray = new Thread[10];

        for (int i=0; i<10; i++) {
            threadArray[i] = new Thread(runnable);
        }

        for (int i=0; i<10; i++) {
            threadArray[i].start();
        }
    }
}
