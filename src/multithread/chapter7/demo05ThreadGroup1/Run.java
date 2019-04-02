package multithread.chapter7.demo05ThreadGroup1;

/**
 * P286
 * 线程组:一级关联
 *
 * Result:
 * 活动线程数为：2
 * ThreadName=Thread-3
 * ThreadName=Thread-2
 * 线程组的名称为：ThreadGroupA
 * ThreadName=Thread-2
 * ThreadName=Thread-3
 * ThreadName=Thread-2
 * ThreadName=Thread-3
 * ThreadName=Thread-2
 * ThreadName=Thread-3
 * ...
 *
 */
public class Run {
    public static void main(String[] args) {
        ThreadA aRunnable = new ThreadA();
        ThreadB bRunnable = new ThreadB();
        ThreadGroup group = new ThreadGroup("ThreadGroupA");
        Thread th1 = new Thread(group,aRunnable);
        Thread th2 = new Thread(group,bRunnable);
        th1.start();
        th2.start();
        System.out.println("活动线程数为：" + group.activeCount());
        System.out.println("线程组的名称为：" + group.getName());
    }
}
