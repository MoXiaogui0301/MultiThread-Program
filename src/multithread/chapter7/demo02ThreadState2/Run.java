package multithread.chapter7.demo02ThreadState2;

/**
 * P282
 * 验证线程的TIMED_WAITING状态
 *
 * Result:
 * MyThread begin sleep
 * main方法中MyThread的状态TIMED_WAITING
 * MyThread end sleep
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.setName("MyThread");
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中" + t.getName() + "的状态" + t.getState());
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
