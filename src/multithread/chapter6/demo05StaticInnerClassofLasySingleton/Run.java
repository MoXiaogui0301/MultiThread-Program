package multithread.chapter6.demo05StaticInnerClassofLasySingleton;

/**
 * P271
 * 静态内置类实现多线程环境中的延迟加载单例设计模式
 * 静态内置类可以达到线程安全，但如果遇到序列化对象时，使用默认的方式运行得到的结果还是多例的
 *
 * Result:
 * 350435183
 * 350435183
 * 350435183
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        MyThread th3 = new MyThread();

        th1.start();
        th2.start();
        th3.start();
    }
}
