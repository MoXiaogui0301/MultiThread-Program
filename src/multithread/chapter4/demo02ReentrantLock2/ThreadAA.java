package multithread.chapter4.demo02ReentrantLock2;

public class ThreadAA extends Thread {
    private MyService myService;

    public ThreadAA(MyService myService)    {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodA();
    }
}
