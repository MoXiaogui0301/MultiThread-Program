package multithread.chapter4.demo17LockMethodlockInterruptibly;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod()    {
        try {
            lock.lockInterruptibly();
//            lock.lock();
            System.out.println("lock begin " + Thread.currentThread().getName());
            for (int i=0; i<Integer.MAX_VALUE/10; i++)  {
                String newString = new String();
                Math.random();
            }
            System.out.println("lock end " + Thread.currentThread().getName());
        } catch (InterruptedException e)    {
            System.out.println(Thread.currentThread().getName() + "进入异常catch语句块！");
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread())   {
                lock.unlock();
            }
        }
    }
}
