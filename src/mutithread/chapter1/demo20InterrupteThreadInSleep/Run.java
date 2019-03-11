package mutithread.chapter1.demo20InterrupteThreadInSleep;

/**
 * P30
 * interrupt()方法使线程在沉睡中被停止
 * 线程在sleep()状态下停止时，会清除停止状态为，isInterrupted()方法返回false
 *
 * Result:
 * Thread-0run begin
 * end!
 * java.lang.InterruptedException: sleep interrupted
 * 	at java.base/java.lang.Thread.sleep(Native Method)
 * 	at mutithread.chapter1.demo20InterrupteThreadInSleep.MyThread.run(MyThread.java:9)
 * Thread-0在沉睡中被停止！进入catch!false
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(500);
            thread.interrupt();
        }catch (InterruptedException e)    {
            System.out.println("main catch an InterruptedException");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
