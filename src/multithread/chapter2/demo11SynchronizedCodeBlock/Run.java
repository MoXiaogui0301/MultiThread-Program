package multithread.chapter2.demo11SynchronizedCodeBlock;

/**
 * P76
 * synchronized同步代码块
 * 同步代码块内的代码线程依次获得锁后执行，其外的代码线程交替执行
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread threadA = new MyThread(task);
        threadA.setName("A");
        MyThread threadB = new MyThread(task);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
