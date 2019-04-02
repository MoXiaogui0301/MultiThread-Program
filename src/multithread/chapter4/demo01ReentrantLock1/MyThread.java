package multithread.chapter4.demo01ReentrantLock1;

public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService)    {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
