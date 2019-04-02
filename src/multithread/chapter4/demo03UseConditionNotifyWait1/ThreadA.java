package multithread.chapter4.demo03UseConditionNotifyWait1;

public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}
