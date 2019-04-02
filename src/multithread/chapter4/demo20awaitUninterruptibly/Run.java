package multithread.chapter4.demo20awaitUninterruptibly;

/**
 * P230
 * Condition.awaitUninterruptibly()
 * 与await()区别在于awaitUninterruptibly()不能被中断，调用该方法的线程在收到signal前一直处于等待状态
 *
 * Result(使用await()):
 * wait begin
 * java.lang.InterruptedException
 * 	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.reportInterruptAfterWait(AbstractQueuedSynchronizer.java:2056)
 * 	at java.base/java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2090)
 * 	at multithread.chapter4.demo20awaitUninterruptibly.Service.testMethod(Service.java:14)
 * 	at multithread.chapter4.demo20awaitUninterruptibly.MyThread.run(MyThread.java:12)
 * catch
 *
 * Result(使用awaitUninterruptibly())
 * wait begin
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            Service service = new Service();
            MyThread myThread = new MyThread(service);
            myThread.start();
            Thread.sleep(3000);
            myThread.interrupt();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
