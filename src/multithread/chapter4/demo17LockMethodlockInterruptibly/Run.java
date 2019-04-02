package multithread.chapter4.demo17LockMethodlockInterruptibly;

/**
 * P227
 * ReentrantLock.lockInterruptibly()方法
 * 如果当前线程未被中断，则获得锁
 * 如果当前线程已被中断，则出现异常
 *
 * Result:
 * lock begin A
 * main end
 * lock end A
 * B进入异常catch语句块！
 * java.lang.InterruptedException
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

        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
        threadB.interrupt();
        System.out.println("main end");
    }
}
