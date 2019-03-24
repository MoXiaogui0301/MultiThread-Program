package multithread.chapter3.demo8NotifyAfterFixedTime;

/**
 * P150
 * 演示使用wait(time)在固定时间time后自动被唤醒
 *
 * Result:
 * wait begin timer=1553327026378
 * wait end timer=1553327029401
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
            } catch (InterruptedException e)    {
                e.printStackTrace();
            }
        }
    };

    public static void main(String[] args) {
        Thread thread = new Thread(runnable1);
        thread.start();
    }
}
