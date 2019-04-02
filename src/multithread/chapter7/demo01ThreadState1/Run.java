package multithread.chapter7.demo01ThreadState1;

/**
 * P281
 * 验证线程的NEW/RUNNABLE/TERMINATED三种状态
 *
 * Result:
 * Thread-0构造方法中的状态：RUNNABLE
 * main方法中MyThread的状态1：NEW
 * MyThreadrun方法中的状态：RUNNABLE
 * main方法中MyThread的状态2：TERMINATED
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.setName("MyThread");
            System.out.println("main方法中MyThread的状态1：" + t.getState());
            Thread.sleep(1000);
            t.start();
            Thread.sleep(1000);
            System.out.println("main方法中MyThread的状态2：" + t.getState());
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
