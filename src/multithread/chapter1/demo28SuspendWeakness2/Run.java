package multithread.chapter1.demo28SuspendWeakness2;

/**
 * P40
 * 程序运行到println()方法内部停止，同步锁未被释放
 *
 * println()源码如下
 * synchronized(this){
 *     print(x);
 *     newLine();
 * }
 *
 * 锁未被释放导致println()方法一直处于暂停状态，
 * 无法执行main方法的  System.out.println("main end！");
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end！");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
