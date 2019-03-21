package multithread.chapter2.demo17SynchronizedConfirm1;

import multithread.chapter2.demo05SynchronizedMethodAndLock2.MyObject;

public class Service {
    public void testMethod1(MyObject object)    {
        synchronized (object)   {
            try {
                System.out.println("test Method1 _____ getLock time = " + System.currentTimeMillis() + "run ThreadName= " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("test Method1 _____ releaseLock time = " + System.currentTimeMillis() + "run ThreadName= " + Thread.currentThread().getName());
            } catch (Exception e)   {
                e.printStackTrace();
            }
        }
    }
}
