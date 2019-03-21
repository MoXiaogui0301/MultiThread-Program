package multithread.chapter1.demo25InterruptThreadByReturn;

/**
 * 通过interrupt()和return可以完成线程的中断
 *
 * 优先采用抛出异常的方法中断线程
 * return不利于流程控制
 *
 * Result:
 * ...
 * timer = 1552290911442
 * timer = 1552290911442
 * Thread-0 停止了
 *
 */
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}
