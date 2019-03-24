package multithread.chapter3.demo13ProducerAndCustomer2;

public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true)    {
            p.setValue();
        }
    }
}
