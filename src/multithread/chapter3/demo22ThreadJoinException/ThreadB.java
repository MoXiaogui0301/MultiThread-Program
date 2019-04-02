package multithread.chapter3.demo22ThreadJoinException;

public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            a.join();
            System.out.println("线程B在run end处打印");
        } catch (InterruptedException e)    {
            System.out.println("线程B在run catch处打印");
            e.printStackTrace();
        }
    }
}
