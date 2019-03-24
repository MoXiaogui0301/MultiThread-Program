package multithread.chapter3.demo7NotifyOneOrAll;

public class MyThread extends Thread {
    private Object lock;

    public MyThread(Object lock)    {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
