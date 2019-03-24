package multithread.chapter3.demo7NotifyOneOrAll;

public class NotifyOneThread extends Thread {
    private Object lock;

    public NotifyOneThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notify();
        }
    }
}
