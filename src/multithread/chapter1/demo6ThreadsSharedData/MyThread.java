package multithread.chapter1.demo6ThreadsSharedData;

public class MyThread extends Thread {

    private int count = 5;

    /**
    @Override
    public void run() {
        super.run();
        count--;
        System.out.println(Thread.currentThread().getName() + "计算的count=" + count);
    }
     */

    @Override
    public synchronized void run() {
        super.run();
        count--;
        System.out.println(Thread.currentThread().getName() + "计算的count=" + count);
    }
}
