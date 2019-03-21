package multithread.chapter1.demo4CreateThread2;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "运行中！");
    }
}
