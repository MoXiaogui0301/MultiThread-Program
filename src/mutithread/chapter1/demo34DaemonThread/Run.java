package mutithread.chapter1.demo34DaemonThread;

/**
 * P50
 * 演示守护线程
 * setDaemon()将线程设置为守护线程
 *
 * Result:
 * i=1
 * i=2
 * i=3
 * i=4
 * i=5
 * main 线程结束，守护线程也随之结束
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.setDaemon(true);
            myThread.start();
            Thread.sleep(5000);
            System.out.println("main 线程结束，守护线程也随之结束");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
