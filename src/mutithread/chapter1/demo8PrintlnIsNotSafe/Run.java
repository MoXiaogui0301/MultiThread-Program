package mutithread.chapter1.demo8PrintlnIsNotSafe;

/**
 * 演示println方法内部同步，但是i--操作却在进入println方法前执行，仍然可能发生线程安全问题
 */
public class Run {

    public static void main(String[] args) {
    MyThread run = new MyThread();
    Thread t1 = new Thread(run);
    Thread t2 = new Thread(run);
    Thread t3 = new Thread(run);
    Thread t4 = new Thread(run);
    Thread t5 = new Thread(run);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    }
}
