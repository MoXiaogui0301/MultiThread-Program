package multithread.chapter2.demo04SynchronizedMethodAndLock;

/**
 * P59(有改动）
 * 1.演示未加入synchronized修饰符的方法可以被多个线程同时进入
 *
 * Result:
 * begin methodA threadName=B
 * begin methodA threadName=A
 * end
 * end
 *
 *
 * 2.演示加入synchronized修饰符的方法，多线程仅能依次获得锁后进入
 *
 * Result:
 * begin methodA threadName=A
 * end
 * begin methodA threadName=B
 * end
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
