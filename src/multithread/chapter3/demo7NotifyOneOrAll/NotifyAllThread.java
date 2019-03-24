package multithread.chapter3.demo7NotifyOneOrAll;

public class NotifyAllThread extends Thread {
    private Object lock;

    public NotifyAllThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            lock.notifyAll();
        }
    }
}
