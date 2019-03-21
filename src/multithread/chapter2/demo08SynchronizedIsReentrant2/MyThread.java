package multithread.chapter2.demo08SynchronizedIsReentrant2;

public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
