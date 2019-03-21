package multithread.chapter2.demo22StringIsUnSuitedForLock;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print("AA");
    }
}
