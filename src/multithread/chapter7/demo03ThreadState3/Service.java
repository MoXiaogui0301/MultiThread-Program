package multithread.chapter7.demo03ThreadState3;

public class Service {
    synchronized public void serviceMethod()    {
        System.out.println(Thread.currentThread().getName() + "进入Service的serviceMethod方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
