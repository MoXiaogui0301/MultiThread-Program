package multithread.chapter4.demo25ReentrantReadWriteLock3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void read()  {
        try {
            try {
                lock.readLock().lock();
                System.out.println(Thread.currentThread().getName() + "获得读锁 " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.readLock().unlock();
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }

    public void write() {
        try {
            try {
                lock.writeLock().lock();
                System.out.println(Thread.currentThread().getName() + "获得写锁 " + System.currentTimeMillis());
                Thread.sleep(10000);
            } finally {
                lock.writeLock().unlock();
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
