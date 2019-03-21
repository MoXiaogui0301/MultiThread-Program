package multithread.chapter2.demo21StaticSynchronized3;

public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
