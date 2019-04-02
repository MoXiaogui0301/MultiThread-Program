package multithread.chapter4.demo15LockMethodisHeldByCurrentThread;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
    private ReentrantLock lock;

    public Service(boolean isFair)  {
        super();
        lock = new ReentrantLock(isFair);
    }

    public void serviceMethod() {
        try {
            System.out.println("lock is held by current thread?" + lock.isHeldByCurrentThread());
            lock.lock();
            System.out.println("lock is held by current thread?" + lock.isHeldByCurrentThread());
        } finally {
            lock.unlock();
        }
    }
}
