package mutithread.chapter1.demo6ThreadsSharedData;

/**
 * 演示五个线程创建时调用Run接口实现类myThread，共享一份变量count，存在线程安全问题，使用synchronize关键字解决
 * 注意创建线程时给线程命名
 * 调用的是同一个MyThread实例，不能在MyThread的构造方法中给线程命名
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
