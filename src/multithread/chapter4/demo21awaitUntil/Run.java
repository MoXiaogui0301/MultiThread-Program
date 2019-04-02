package multithread.chapter4.demo21awaitUntil;

/**
 * P232
 * Condition.awaitUntil(long time)方法
 * 调用该方法的线程在 达到指定时间前/被唤醒前/被中断前 一直保持锁定状态
 *
 * Result:
 * wait begin timer=1553680738381
 * notify begin timer=1553680740244
 * notify end timer=1553680740245
 * wait end timer=1553680740246
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        Thread.sleep(2000);
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
