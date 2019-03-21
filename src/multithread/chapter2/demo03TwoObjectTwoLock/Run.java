package multithread.chapter2.demo03TwoObjectTwoLock;

/**
 * P57(有改动)
 * 演示synchronized修饰方法时，持有的是对象锁
 * 不同对象持有的是不同的锁，调用不同对象的同步方法仍然将异步执行
 *
 * Result:
 * a set over!
 * b set over!
 * b num=200
 * a num=100
 *
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        MyThread thread1 = new MyThread(numRef1,"a");
        MyThread thread2 = new MyThread(numRef2,"b");
        thread1.start();
        thread2.start();
    }
}
