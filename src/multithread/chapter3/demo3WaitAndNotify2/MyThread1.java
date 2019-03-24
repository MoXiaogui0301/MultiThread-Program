package multithread.chapter3.demo3WaitAndNotify2;

public class MyThread1 extends Thread {
    private Object lock;

    public MyThread1(Object lock)   {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("begin wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("end wait time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
