package multithread.chapter3.demo21ThreadJoin;

/**
 * P180
 * 演示join()方法，thread.join()，在当前线程中插入线程thread，当前线程在插入线程thread执行完毕后执行
 *
 * Result:
 * 1553514062761
 * 4028
 * 1553514066791
 * 我想当threadTest对象执行完毕后再执行，我做到了
 *
 */
public class Test {
    public static void main(String[] args) {
        try {
            MyThread threadTest = new MyThread();
            threadTest.start();
            System.out.println(System.currentTimeMillis());
            //Thread.sleep(?)
            //sleep方法无法判断睡眠时间
            //使用join()
            threadTest.join();
            System.out.println(System.currentTimeMillis());
            System.out.println("我想当threadTest对象执行完毕后再执行，我做到了");
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
