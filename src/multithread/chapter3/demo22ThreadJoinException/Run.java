package multithread.chapter3.demo22ThreadJoinException;

/**
 * P181
 * 演示线程B在线程A.join()的情况下，被线程C打断
 * 线程B将抛出InterruptedException，但线程A继续运行
 *
 * 存疑：下述结果为debug获得的输出
 * 选择正常运行时程序一直执行，无输出也没有异常
 *
 * Result:
 * Connected to the target VM, address: '127.0.0.1:52281', transport: 'socket'
 * 线程B在run catch处打印
 * java.lang.InterruptedException
 * 	at java.base/java.lang.Object.wait(Native Method)
 * 	at java.base/java.lang.Thread.join(Thread.java:1305)
 * 	at java.base/java.lang.Thread.join(Thread.java:1379)
 * 	at multithread.chapter3.demo22ThreadJoinException.ThreadB.run(ThreadB.java:9)
 * 	...(程序继续执行)
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            b.start();
            Thread.sleep(500);
            ThreadC c = new ThreadC(b);
            c.start();
        } catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
