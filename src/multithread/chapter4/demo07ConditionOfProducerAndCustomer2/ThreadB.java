package multithread.chapter4.demo07ConditionOfProducerAndCustomer2;

public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            myService.get();
    }
}
