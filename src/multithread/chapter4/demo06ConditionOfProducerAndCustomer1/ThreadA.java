package multithread.chapter4.demo06ConditionOfProducerAndCustomer1;

public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++)
            myService.set();
    }
}
