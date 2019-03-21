package multithread.chapter1.demo21InterruptThreadInSleep2;

/**
 * P31
 * thread.interrupt()更改thread的中断标志位
 * thread继续执行完for循环
 * thread进入sleep
 * thread被中断
 *
 * Result:
 * end!
 * i=1
 * i=2
 * ...
 * i=9998
 * i=9999
 * i=10000
 * run begin
 * 先interrupt，再执行for，之后线程进入sleep时被中断
 * java.lang.InterruptedException: sleep interrupted
 * 	at java.base/java.lang.Thread.sleep(Native Method)
 * 	at mutithread.chapter1.demo21InterruptThreadInSleep2.MyThread.run(MyThread.java:12)
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
