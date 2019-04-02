package multithread.chapter3.demo24ThreadJoinAndSleep;

public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b)   {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b)    {
                b.start();
                Thread.sleep(6000);
                //Thread.sleep()不释放锁
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
