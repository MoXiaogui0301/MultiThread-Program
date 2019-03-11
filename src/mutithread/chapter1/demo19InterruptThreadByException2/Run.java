package mutithread.chapter1.demo19InterruptThreadByException2;

/**
 * P29
 * 通过抛出InterruptedException退出thread
 *
 * Result:
 * ...
 * i=6405
 * i=6406
 * i=6407
 * 已经是停止状态，即将退出
 * 进入MyThread.java类run方法中的catch语句块了
 * java.lang.InterruptedException
 * 	at mutithread.chapter1.demo19InterruptThreadByException2.MyThread.run(MyThread.java:11)
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(100);
            thread.interrupt();
        }   catch (InterruptedException e)  {
            System.out.println("main catch an InterruptedException");
            e.printStackTrace();
        }
    }
}
