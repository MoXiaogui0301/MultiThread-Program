package multithread.chapter3.demo6WaitThrowExceptionWhenInterrupt;

public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {
                System.out.println("begin wait");
                lock.wait();
                System.out.println("end wait");
            }
        } catch (InterruptedException e)    {
            e.printStackTrace();
            System.out.println("出现异常：wait状态线程被interrupt了");
        }
    }
}
