package multithread.chapter6.demo08EnumofLasySingleton1;

/**
 * P275
 * 通过枚举enum实现多线程单例
 * 缺点，MyThread类中曝露了枚举类，违反了"单一职责原理"
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
