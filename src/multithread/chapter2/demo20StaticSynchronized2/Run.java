package multithread.chapter2.demo20StaticSynchronized2;

/**
 * P99
 * 验证类锁，用Synchronized修饰static方法使用类锁
 * 对该类的所有对象起作用(即该类所有对象调用synchronize修饰的static方法都需同步)
 *
 * A和B为Service类的不同静态方法，都使用Synchronized修饰
 * ThreadA和ThreadB两个线程通过不同的Service对象调用Service同步类方法，会因为类锁产生阻塞
 *
 * Result:
 * 线程名称为:A在1553149339174进入printA
 * 线程名称为:A在1553149342235离开printA
 * 线程名称为:B在1553149342237进入printB
 * 线程名称为:B在1553149342238离开printB
 *
 */
public class Run {
    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();

        ThreadA a = new ThreadA(service1);
        a.setName("A");
        ThreadB b = new ThreadB(service2);
        b.setName("B");

        a.start();
        b.start();
    }
}
