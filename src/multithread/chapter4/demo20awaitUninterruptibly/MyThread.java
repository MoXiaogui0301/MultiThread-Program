package multithread.chapter4.demo20awaitUninterruptibly;

public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service)    {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
