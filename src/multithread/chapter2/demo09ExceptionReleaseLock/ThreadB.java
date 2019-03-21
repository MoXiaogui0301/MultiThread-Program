package multithread.chapter2.demo09ExceptionReleaseLock;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
