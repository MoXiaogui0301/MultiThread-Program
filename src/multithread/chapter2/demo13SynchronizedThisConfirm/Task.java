package multithread.chapter2.demo13SynchronizedThisConfirm;

public class Task {

    synchronized public void otherMethod()   {
        try {
            Thread.sleep(200);
        } catch (Exception e)   {
            e.printStackTrace();
        }
        System.out.println("-------------- run otherMethod");
    }

    public void doLongTimeTask()    {
        synchronized (this) {
            for (int i=0;i<5;i++)   {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e)    {
                    e.printStackTrace();
                }
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
            }
        }
    }
}
