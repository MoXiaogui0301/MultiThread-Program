package multithread.chapter2.demo27ChangeLock;

public class ThreadB extends Thread {
    private MyService service;

    public ThreadB(MyService service)   {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
