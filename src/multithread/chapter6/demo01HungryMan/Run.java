package multithread.chapter6.demo01HungryMan;

/**
 * P262
 * 单例模式 立即加载/饿汉式
 * 在MyObject类中定义实例变量 private static MyObject myObject = new MyObject();
 *
 * Result:
 * 1721588072
 * 1721588072
 * 1721588072
 *
 * 哈希码相同，可见三个线程创建的是同一个MyObject对象
 *
 */

public class Run {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
