package multithread.chapter1.demo25InterruptThreadByReturn;

public class MyThread extends Thread {
    @Override
    public void run() {
        while(true) {
            if (this.isInterrupted())   {
                System.out.println(Thread.currentThread().getName() + " 停止了");
                return;
            }
            System.out.println("timer = " + System.currentTimeMillis());
        }
    }
}
