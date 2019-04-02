package multithread.chapter7.demo04ThreadState4;

public class MyThread extends Thread {
    Object b = new String("123");

    @Override
    public void run() {
        try {
            synchronized (b)    {
                b.wait();
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
