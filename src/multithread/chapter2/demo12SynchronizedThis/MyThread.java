package multithread.chapter2.demo12SynchronizedThis;

public class MyThread extends Thread {
    private ObjectService service;

    public MyThread(ObjectService service)  {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        if (Thread.currentThread().getName().equals("A"))
            service.serviceMethodA();
        else
            service.serviceMethodB();
    }
}
