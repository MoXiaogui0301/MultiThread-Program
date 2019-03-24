package multithread.chapter3.demo5NotifyHoldLock;

public class Service {

    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait at " + System.currentTimeMillis() +" "+ Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait at " + System.currentTimeMillis() +" "+ Thread.currentThread().getName());
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }

    public void synNotifyMethod(Object lock)    {
        try {
            synchronized (lock) {
                System.out.println("begin notify at " + System.currentTimeMillis() +" "+ Thread.currentThread().getName());
                lock.notify();
                Thread.sleep(2000);
                System.out.println("end notify at " + System.currentTimeMillis() +" "+ Thread.currentThread().getName());
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
