package multithread.chapter1.demo31ThreadPriorityInheritance;

/**
 * 演示线程优先级的继承性
 * 在线程A启动线程B，那么B和A有相同的线程优先级
 *
 * Result:
 * main thread begin priority = 5
 * main thread end priority = 7
 * Thread-0 run priority = 7
 * Thread-1 run priority = 7
 *
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority = " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println("main thread end priority = " + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
