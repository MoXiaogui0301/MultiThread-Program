package multithread.chapter2.demo14SynchronizedUsingObject;

/**
 * P83
 * 演示使用任意对象作为同步代码块的锁(对象监视器)
 * 适用于一个类中有多个Synchronized方法，合理地选择性同步，可以提高程序效率
 *
 * Result:
 * 线程名称为：Thread-0在1553052599075进入同步块
 * 线程名称为：Thread-0在1553052602142离开同步块
 * 线程名称为：Thread-1在1553052602143进入同步块
 * 线程名称为：Thread-1在1553052605148离开同步块
 *
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.start();
        threadB.start();
    }
}
