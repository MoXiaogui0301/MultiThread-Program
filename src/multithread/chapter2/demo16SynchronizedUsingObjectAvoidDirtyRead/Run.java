package multithread.chapter2.demo16SynchronizedUsingObjectAvoidDirtyRead;

/**
 * P88
 * 演示使用Synchronized消除脏读的现象
 *
 * Result:
 * listSize = 2
 *
 * 使用Synchronized修饰MyService类的addServiceMethod方法代码块后，消除脏读
 * Result:
 * listSize = 1
 *
 */

public class Run {
    public static void main(String[] args) {
        MyOneList list = new MyOneList();
        MyThread1 thread1 = new MyThread1(list);
        MyThread2 thread2 = new MyThread2(list);
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("listSize = " + list.getSize());
    }
}
