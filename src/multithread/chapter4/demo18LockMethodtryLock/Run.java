package multithread.chapter4.demo18LockMethodtryLock;

/**
 * P228
 * ReentrantLock.tryLock()方法
 * 仅当调用时锁未被另一个线程保持时，才获取该锁
 *
 * Result:
 * A获得锁
 * B没有获得锁
 *
 */
public class Run {
    public static void main(String[] args) {
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
        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();
    }
}
