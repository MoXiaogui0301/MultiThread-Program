package multithread.chapter2.demo21StaticSynchronized3;

/**
 * P101
 * 类锁的另一种形式，使用Synchronized(Service.class)代替Synchronized static method
 *
 * Result:
 * 线程名称为:A在1553149758682进入printA
 * 线程名称为:A在1553149761770离开printA
 * 线程名称为:B在1553149761771进入printB
 * 线程名称为:B在1553149761772离开printB
 *  *
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
