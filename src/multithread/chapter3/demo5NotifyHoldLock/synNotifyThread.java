package multithread.chapter3.demo5NotifyHoldLock;

public class synNotifyThread extends Thread {
    private Object lock;

    public synNotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
