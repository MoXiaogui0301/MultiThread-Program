package mutithread.chapter1.demo33ThreadPriority2;

/**
 * P49
 * 试验优先级不同的线程，哪个运行较快
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread1 = new MyThread();
            MyThread thread2 = new MyThread();
            thread1.setPriority(Thread.NORM_PRIORITY + 4);
            thread2.setPriority(Thread.NORM_PRIORITY - 4);
            thread1.start();
            thread2.start();
            Thread.sleep(2000);
            thread1.stop();
            thread2.stop();
            System.out.println("thread1 = " + thread1.getCount());
            System.out.println("thread2 = " + thread2.getCount());
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
