package multithread.chapter2.demo07SynchronizedIsReentrant;

/**
 * P65
 * 演示synchronized的锁重入性
 * 线程在已经获得当前锁的前提下，再次请求当前锁一定可以得到
 * 如果不可锁重入的话，将造成死锁
 *
 * Result:
 * Thread-0service1
 * Thread-0service2
 * Thread-0service3
 * Thread-2service1
 * Thread-2service2
 * Thread-2service3
 * Thread-1service1
 * Thread-1service2
 * Thread-1service3
 * 各个Thread彼此不会交叉
 *
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread thread1 = new MyThread(service);
        MyThread thread2 = new MyThread(service);
        MyThread thread3 = new MyThread(service);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
