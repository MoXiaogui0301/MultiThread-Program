package multithread.chapter3.demo6WaitThrowExceptionWhenInterrupt;

/**
 * P146
 * 演示当线程处于wait状态被interrupt()方法中断时，抛出InterruptedException异常
 * 与第一章对比，线程sleep()中被interrupt()，也将抛出InterruptedException异常
 *
 * Result:
 * begin wait
 * java.lang.InterruptedException
 * 	at java.base/java.lang.Object.wait(Native Method)
 * 	at java.base/java.lang.Object.wait(Object.java:328)
 * 	at multithread.chapter3.demo6WaitThrowExceptionWhenInterrupt.Service.testMethod(Service.java:8)
 * 	at multithread.chapter3.demo6WaitThrowExceptionWhenInterrupt.ThreadA.run(ThreadA.java:13)
 * 出现异常：wait状态线程被interrupt了
 *
 */

public class Test {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
