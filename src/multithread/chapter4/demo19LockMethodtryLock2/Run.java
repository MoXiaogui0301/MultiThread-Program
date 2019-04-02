package multithread.chapter4.demo19LockMethodtryLock2;

/**
 * P229
 * ReentrantLock.tryLock(long timeout,TimeUnit unit)方法
 * 如果锁定在给定等待时间内没有被另一个线程保持，且当前线程未被中断，则获取该锁定
 *
 * Result:
 * B调用waitMethod时间：1553678305819
 * A调用waitMethod时间：1553678305819
 *     B 获得锁的时间:1553678305915
 *     A 没有获得锁
 *
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "调用waitMethod时间：" + System.currentTimeMillis());
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        Thread threadB = new Thread(runnable);
        threadB.setName("B");

        threadA.start();
        threadB.start();
    }
}
