package multithread.chapter6.demo09EnumofLasySingleton2;

/**
 * P277
 * 完善了枚举enum实现多线程单例
 * 不在MyThread类中曝露枚举类，满足"单一职责原理"
 *
 * Result:
 * 由于是建立数据库连接，所以不做测试
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
