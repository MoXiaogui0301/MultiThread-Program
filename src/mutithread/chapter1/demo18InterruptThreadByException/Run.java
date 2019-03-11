package mutithread.chapter1.demo18InterruptThreadByException;

/**
 * P28
 * interrupt改变标志位后，调用break退出thread的for循环
 * 但for之后代码继续执行，thread并未退出
 *
 * Result:
 * ...
 * i=4502
 * i=4503
 * i=4504
 * i=4505
 * i=4506
 * end!
 * Thread-0 已经是停止状态，将要退出
 * 我被输出，仅break出原for循环，之后的代码继续执行
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(100);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch InterruptedException");
        }
        System.out.println("end!");
    }

}
