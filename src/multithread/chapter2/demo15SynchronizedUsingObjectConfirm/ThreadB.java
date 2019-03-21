package multithread.chapter2.demo15SynchronizedUsingObjectConfirm;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.b();
    }
}
