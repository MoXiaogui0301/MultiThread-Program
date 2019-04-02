package multithread.chapter4.demo10LockMethodgetQueueLength;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock = new ReentrantLock();

    public void serviceMethod1()    {
        try {
            lock.lock();
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " 进入方法！");
            Thread.sleep(5000);
            System.out.println("有" + lock.getQueueLength() + "个线程等待获取锁！");
        } catch (InterruptedException e)    {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
