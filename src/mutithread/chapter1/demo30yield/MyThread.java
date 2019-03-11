package mutithread.chapter1.demo30yield;

/**
 * yield()  A hint to the scheduler that the current thread is willing to yield its current use of a processor.
 * 通过加入线程礼让方法yield()，体现礼让导致执行时间变长
 *
 * Result1(无礼让情况)
 * 用时：6毫秒
 *
 * Result2(礼让情况)
 * 用时：用时：3722毫秒
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 5000000; i++)   {
            Thread.yield();
            count = count + (i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + ( endTime - beginTime ) + "毫秒");
    }
}
