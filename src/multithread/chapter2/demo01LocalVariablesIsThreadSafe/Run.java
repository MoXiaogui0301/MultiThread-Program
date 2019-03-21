package multithread.chapter2.demo01LocalVariablesIsThreadSafe;

/**
 * P53(有改动)
 * 演示HasSelfPrivateNum的addI()方法定义的num是局部变量，不存在线程安全问题
 *
 * Results:
 * a set over!
 * b set over!
 * b num=200
 * a num=100
 *
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        MyThread thread1 = new MyThread(numRef,"a");
        MyThread thread2 = new MyThread(numRef,"b");
        thread1.start();
        thread2.start();
    }
}
