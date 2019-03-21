package multithread.chapter2.demo14SynchronizedUsingObject;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a","aa");
    }
}
