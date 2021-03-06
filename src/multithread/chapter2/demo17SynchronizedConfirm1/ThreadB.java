package multithread.chapter2.demo17SynchronizedConfirm1;

import multithread.chapter2.demo05SynchronizedMethodAndLock2.MyObject;

public class ThreadB extends Thread {

    private Service service;
    private MyObject object;

    public ThreadB(Service service,MyObject object) {
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
