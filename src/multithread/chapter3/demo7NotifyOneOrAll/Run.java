package multithread.chapter3.demo7NotifyOneOrAll;

/**
 * P148
 * 演示多个线程wait等待lock对象锁时，notify仅随机使一个线程释放对象锁
 *
 * Result:
 * begin wait() ThreadName=Thread-0
 * begin wait() ThreadName=Thread-2
 * begin wait() ThreadName=Thread-1
 * end wait() ThreadName=Thread-0
 *
 * 此外，如果使用NotifyAllThread的notifyAll()方法，则唤醒所有线程
 * Result:
 * begin wait() ThreadName=Thread-0
 * begin wait() ThreadName=Thread-2
 * begin wait() ThreadName=Thread-1
 * end wait() ThreadName=Thread-0
 * end wait() ThreadName=Thread-1
 * end wait() ThreadName=Thread-2
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThread threadA = new MyThread(lock);
        threadA.start();
        MyThread threadB = new MyThread(lock);
        threadB.start();
        MyThread threadC = new MyThread(lock);
        threadC.start();

        Thread.sleep(1000);

//        NotifyOneThread notifyOneThread = new NotifyOneThread(lock);
//        notifyOneThread.start();

        NotifyAllThread notifyAllThread = new NotifyAllThread(lock);
        notifyAllThread.start();

    }
}
