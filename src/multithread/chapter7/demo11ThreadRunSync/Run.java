package multithread.chapter7.demo11ThreadRunSync;

/**
 * P291
 * 通过代码控制线程有序输出
 *
 * Result:
 * ThreadName=Thread-0 runCount=1 A
 * ThreadName=Thread-1 runCount=2 B
 * ThreadName=Thread-2 runCount=3 C
 * ThreadName=Thread-0 runCount=4 A
 * ThreadName=Thread-1 runCount=5 B
 * ThreadName=Thread-2 runCount=6 C
 * ThreadName=Thread-0 runCount=7 A
 * ThreadName=Thread-1 runCount=8 B
 * ThreadName=Thread-2 runCount=9 C
 *
 */
public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThread a = new MyThread(lock, "A", 1);
        MyThread b = new MyThread(lock, "B", 2);
        MyThread c = new MyThread(lock, "C", 0);

        a.start();
        b.start();
        c.start();
    }
}
