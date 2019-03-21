package multithread.chapter2.demo05SynchronizedMethodAndLock2;

/**
 * P61(有改动)
 * 演示synchronized修饰方法时，默认锁对象为this，即当前实例
 * 1.thread1调用同步方法methodA，threadB调用普通方法methodB，两个线程异步执行
 *
 * Result:(异步执行)
 * begin methodA threadName=A
 * begin methodB threadName=B begin time=1552463941459
 * MethodA end endTime=1552463943550
 * MethodB end
 *
 * 2.将methodB也修改为同步方法，即thread1调用同步方法methodA，thread2调用同步方法methodB，两个线程同步执行
 *
 * Result:(同步执行)
 * begin methodA threadName=A
 * MethodA end endTime=1552464182718
 * begin methodB threadName=B begin time=1552464182727
 * MethodB end
 *
 */
public class Run {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        MyThread thread1 = new MyThread(myObject);
        thread1.setName("A");
        MyThread thread2 = new MyThread(myObject);
        thread2.setName("B");
        thread1.start();
        thread2.start();
    }
}
