package mutithread.chapter1.demo13sleep;

/**
 *
 * P21
 * 调用run()，主线程调用myThread1的执行方法，未开启新线程
 *
 * Result:
 * begin =1552277211258
 * run threadName=main begin
 * run threadName=main end
 * end =1552277213307
 */
public class Run1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin =" + System.currentTimeMillis());
        myThread1.run();
        System.out.println("end =" + System.currentTimeMillis());
    }
}
