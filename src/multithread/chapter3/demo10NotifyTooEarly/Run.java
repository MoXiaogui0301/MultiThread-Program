package multithread.chapter3.demo10NotifyTooEarly;

/**
 * P152
 * 演示通知过早，wait()一直阻塞
 *
 * Result:
 * begin notify
 * end notify
 * begin wait
 *
 */
public class Run {
    private String lock = new String("");

    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    System.out.println("begin wait");
                    lock.wait();
                    System.out.println("end wait");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Run run = new Run();
        Thread b = new Thread(run.runnableB);
        b.start();
        Thread.sleep(100);
        Thread a = new Thread(run.runnableA);
        a.start();
    }

}

