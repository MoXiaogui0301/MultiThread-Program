package multithread.chapter4.demo24ReentrantReadWriteLock2;

import multithread.chapter4.demo24ReentrantReadWriteLock2.Service;

/**
 * P237
 * ReentrantReadWriteLock使用示例2：写写互斥
 * 读锁是共享锁，读读共享，读写互斥，写写互斥
 *
 * 在写锁lock()后，后面的线程等待前面的线程释放写锁后获得该锁
 *
 * Result：(后一个线程在10秒后获得前一个线程释放得写锁)
 * B获得写锁，1553683550868
 * A获得写锁，1553683560975
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
