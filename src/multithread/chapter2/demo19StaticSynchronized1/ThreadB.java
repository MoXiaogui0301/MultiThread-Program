package multithread.chapter2.demo19StaticSynchronized1;

public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
