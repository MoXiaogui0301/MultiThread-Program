package multithread.chapter4.demo25ReentrantReadWriteLock3;

/**
 * P238
 * ReentrantReadWriteLock使用实例3，读写互斥 写读互斥
 *
 * Result(读写互斥):
 * A获得读锁 1553684044636
 * B获得写锁 1553684054691
 *
 * Result(写读互斥)：
 * B获得写锁 1553684185207
 * A获得读锁 1553684195300
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
//        a.start();
        b.start();
        Thread.sleep(1000);
//        b.start();
        a.start();

    }
}
