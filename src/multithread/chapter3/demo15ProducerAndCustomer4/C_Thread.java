package multithread.chapter3.demo15ProducerAndCustomer4;

public class C_Thread extends Thread {

    private C c;

    public C_Thread(C c)    {
        this.c = c;
    }

    @Override
    public void run() {
        while (true)    {
            c.popService();
        }
    }
}
