package multithread.chapter4.demo16LockMethodisLocked;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair)  {
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            System.out.println("lock is locked? " + lock.isLocked());
            lock.lock();
            System.out.println("lock is locked? " + lock.isLocked());
        } finally {
            lock.unlock();
        }
    }
}
