package multithread.chapter2.demo10SynchronizedIsNotSuccession;

public class MyThread extends Thread {
    private Sub sub;
    public MyThread(Sub sub)    {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
