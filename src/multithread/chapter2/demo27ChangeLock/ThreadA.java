package multithread.chapter2.demo27ChangeLock;

public class ThreadA extends Thread {
    private MyService service;

    public ThreadA(MyService service)   {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
