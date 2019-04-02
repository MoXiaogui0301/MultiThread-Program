package multithread.chapter7.demo02ThreadState2;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(getName() + " begin sleep");
            Thread.sleep(10000);
            System.out.println(getName() + " end sleep");
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
