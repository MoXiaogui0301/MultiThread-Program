package multithread.chapter3.demo9NotifyAfterFixedTime2;

/**
 * P151
 * 演示wait(time)的线程在时间time到来之前，可以被notify
 *
 * 线程设定wait(3000)，但在2000ms后被notify
 *
 * Result:
 * wait begin timer=1553327549294
 * notify begin timer=1553327551300
 * notify end timer=1553327551301
 * wait end timer=1553327551302
 *
 */
public class MyRunnable {
    static private Object lock = new Object();

    static private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer=" + System.currentTimeMillis());
                    lock.wait(3000);
                    System.out.println("wait end timer=" + System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    static private Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("notify begin timer=" + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end timer=" + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        Thread.sleep(2000);
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
