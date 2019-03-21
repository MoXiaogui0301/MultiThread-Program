package multithread.chapter2.demo22StringIsUnSuitedForLock;

/**
 * P102
 * 演示使用字符串作为锁产生的不可预料问题，应避免使用字符串作为锁
 * 本例中使用字符串作为锁，当A和B两个线程均传入"AA"作为打印字符串和锁时，由于字符串常量池特性，"AA"为同一把锁，造成B线程无法执行
 *
 * Result:
 * A
 * A
 * A
 * A
 * ......(B线程无法执行)
 *
 */

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
