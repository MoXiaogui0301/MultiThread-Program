package multithread.chapter2.demo19StaticSynchronized1;

/**
 * P97
 * 同时使用类锁和对象锁，两者(AB类锁和C对象锁)相互不冲突，类锁对所有类的对象实例(AB)起作用
 *
 * Result:
 * 线程名称为:A在1553148873933进入printA
 * 线程名称为:C在1553148873934进入printC
 * 线程名称为:C在1553148874073离开printC
 * 线程名称为:A在1553148877077离开printA
 * 线程名称为:B在1553148877079进入printB
 * 线程名称为:B在1553148877079离开printB
 *
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        ThreadC c = new ThreadC(service);
        a.setName("A");
        b.setName("B");
        c.setName("C");
        a.start();
        b.start();
        c.start();
    }
}
