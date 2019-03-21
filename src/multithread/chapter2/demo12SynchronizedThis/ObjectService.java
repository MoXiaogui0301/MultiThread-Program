package multithread.chapter2.demo12SynchronizedThis;

public class ObjectService {
    public void serviceMethodA()    {
        try {
            synchronized (this) {
                System.out.println("A begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("A end   time=" + System.currentTimeMillis());
            }
        } catch (InterruptedException e)      {
            e.printStackTrace();
        }
    }

    public void serviceMethodB()    {
        synchronized (this) {
            System.out.println("B begin time" + System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B end   time" + System.currentTimeMillis());
        }
    }
}
