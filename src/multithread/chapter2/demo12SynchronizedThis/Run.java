package multithread.chapter2.demo12SynchronizedThis;

/**
 * P78
 * 演示Synchronized(this)使用当前对象作为锁
 * 当线程A使用this锁进入一同步代码块时，线程B必须等待this锁释放后，才能进入其他的同步代码块
 *
 * Result:
 * A begin time=1553049195486
 * A end   time=1553049197570
 * B begin time1553049197571
 * B end   time1553049199574
 *
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        MyThread threadA = new MyThread(service);
        threadA.setName("A");
        MyThread threadB = new MyThread(service);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
