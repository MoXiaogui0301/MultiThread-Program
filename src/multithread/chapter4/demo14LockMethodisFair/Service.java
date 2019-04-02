package multithread.chapter4.demo14LockMethodisFair;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock = new ReentrantLock();

    public Service(boolean isFair)  {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + "公平锁情况:" + lock.isFair());
        } finally {
            lock.unlock();
        }
    }
}
