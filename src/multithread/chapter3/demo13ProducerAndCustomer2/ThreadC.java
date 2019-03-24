package multithread.chapter3.demo13ProducerAndCustomer2;

public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.getValue();
    }
}
