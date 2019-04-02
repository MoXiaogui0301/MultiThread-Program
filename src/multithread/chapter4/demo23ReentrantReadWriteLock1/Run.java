package multithread.chapter4.demo23ReentrantReadWriteLock1;

/**
 * P236
 * ReentrantReadWriteLock使用示例1：读读共享
 * 读锁是共享锁，读读共享，读写互斥，写写互斥
 *
 * 在读锁lock()后，后面的线程依然获得读锁
 *
 * Result：
 * 获得 读 锁 A 1553682991308
 * 获得 读 锁 B 1553682991308
 *
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        b.start();
    }
}
