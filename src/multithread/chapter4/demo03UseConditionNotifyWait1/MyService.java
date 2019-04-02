package multithread.chapter4.demo03UseConditionNotifyWait1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();    //必须调用lock.lock()将lock上锁后才能调用condition.wait()
            System.out.println("A");
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e)    {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("锁释放啦");
        }
    }
}
