package multithread.chapter3.demo3WaitAndNotify2;

/**
 * P138
 * 演示使用wait-notify机制完成线程通信
 *
 * wait()方法是Object类的方法，用来将当前线程置入"预执行队列"中，
 * 并在wait()所在的代码行处停止执行，直到接到通知或被中断位置
 *
 * 调用wait()前，线程必须获得该对象的对象级别锁，即只能在同步方法或同步块中调用wait()方法
 * 执行wait()后，当前线程释放锁。在从wait()返回前，当前线程与其他线程竞争获得锁
 * 如果调用wait()时，没有持有适当的锁，则抛出IllegalMonitorStateException，属于RuntimeException，不需要try-catch捕捉
 *
 * 调用notify()前，线程也必须获得该对象的对象级别锁，即notify()方法只能在同步方法或同步块中调用
 * 如果调用notify()时没有持有适当的锁，也会抛出IllegalMonitorStateException
 *
 * notify()用来通知那些可能等待该对象的对象锁的其他线程，
 * 如果有多个线程等待，则由线程规划器随机挑选一个wait状态的线程，对其发出notify通知，使它获取该对象的对象锁
 * 需要注意的是，执行notify()后，当前线程会在执行完毕后再释放notify对象的对象锁，而不是立刻释放
 *
 * Result:
 * begin wait time=1553247698915
 * begin notify time=1553247701917
 * end notify time=1553247701917
 * end wait time=1553247701918
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
            Thread.sleep(3000);
            MyThread2 t2 = new MyThread2(lock);
            t2.start();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}

