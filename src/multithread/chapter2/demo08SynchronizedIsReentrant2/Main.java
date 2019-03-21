package multithread.chapter2.demo08SynchronizedIsReentrant2;

public class Main {
    public int i = 10;
    synchronized public void operateIMainMethod()   {
        try {
            i--;
            System.out.println("main print i=" + i);
            Thread.sleep(100);
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
