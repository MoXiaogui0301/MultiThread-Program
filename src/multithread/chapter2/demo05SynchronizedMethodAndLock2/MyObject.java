package multithread.chapter2.demo05SynchronizedMethodAndLock2;

public class MyObject {
    synchronized public void methodA()  {
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("MethodA end endTime=" + System.currentTimeMillis());
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public void methodB()   {
    public synchronized void methodB()   {
        try {
            System.out.println("begin methodB threadName=" + Thread.currentThread().getName() +
            " begin time=" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("MethodB end");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
