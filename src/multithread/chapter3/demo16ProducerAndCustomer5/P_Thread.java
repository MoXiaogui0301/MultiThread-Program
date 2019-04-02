package multithread.chapter3.demo16ProducerAndCustomer5;

public class P_Thread extends Thread {
    private P p;

    public P_Thread(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true)
            p.pushService();
    }
}
