package multithread.chapter2.demo32AtomicIntegerIsNotAbsolutelySafe;

public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service)  {
        this.service = service;
    }

    @Override
    public void run() {
        service.addNum();
    }
}
