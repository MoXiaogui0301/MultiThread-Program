package multithread.chapter2.demo07SynchronizedIsReentrant;

public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service)    {
        this.service = service;
    }
    @Override
    public void run() {
        service.service1();
    }
}
