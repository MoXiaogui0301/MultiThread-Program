package multithread.chapter6.demo02LasyMan1;

/**
 * P264
 * 单例模式：延迟加载/懒汉模式
 * 缺点：在多线程环境中，可能会创建多个实例
 *
 * Result:
 * 1537727887
 * 222500938
 * 438618715
 * (三个线程创建了不同实例)
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
