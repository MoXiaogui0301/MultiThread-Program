package multithread.chapter7.demo04ThreadState4;

/**
 * P284
 * 验证Thread的WAITING状态
 *
 * Result:
 * main方法中的MyThread状态为WAITING
 * ...(MyThread一直waiting，继续运行)
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("MyThread");
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
        System.out.println("main方法中的" + t.getName() + "状态为" + t.getState() );
    }
}
