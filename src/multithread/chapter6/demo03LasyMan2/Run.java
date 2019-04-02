package multithread.chapter6.demo03LasyMan2;

/**
 * P266
 * 通过Synchronized同步方法和同步代码块解决单例模式(懒汉式)在多线程环境下创建多个实例的问题
 * 问题，效率太低
 *
 * Result1(synchronized同步方法):
 * 809359665
 * 809359665
 * 809359665
 *
 * Result2(synchronized 类类型):
 * 168581205
 * 168581205
 * 168581205
 *
 * Result3(synchronized 创建实例的语句块):
 * 222500938
 * 2134182719
 * 1750772243
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
