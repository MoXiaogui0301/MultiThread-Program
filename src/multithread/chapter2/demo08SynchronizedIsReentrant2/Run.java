package multithread.chapter2.demo08SynchronizedIsReentrant2;

/**
 * P66
 * 演示锁可重入性在父类和子类的应用:
 * 当存在继承关系时，子类可以通过可重入锁调用父类的同步方法
 *
 * Result:
 * sub print i=9
 * main print i=8
 * sub print i=7
 * main print i=6
 * sub print i=5
 * main print i=4
 * sub print i=3
 * main print i=2
 * sub print i=1
 * main print i=0
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
