package multithread.chapter7.demo15ThreadException;

/**
 * P297
 * 线程中出现异常
 *
 * Result:
 * Exception in thread "Thread-0" java.lang.NullPointerException
 * 	at multithread.chapter7.demo15ThreadException.MyThread.run(MyThread.java:7)
 *
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
