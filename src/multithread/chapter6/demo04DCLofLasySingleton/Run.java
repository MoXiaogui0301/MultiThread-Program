package multithread.chapter6.demo04DCLofLasySingleton;

/**
 * P270
 * DCL(双检查锁机制)实现多线程环境中的延迟加载单例设计模式
 * 在同步代码块(创建对象)之前进行两次非空判断
 *
 * Result:
 * 438618715
 * 438618715
 * 438618715
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
