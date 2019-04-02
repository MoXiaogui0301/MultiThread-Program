package multithread.chapter4.demo01ReentrantLock1;

/**
 * P200
 * 使用ReentrantLock类完成同步
 *
 * Result:
 * ThreadName=Thread-2 1
 * ThreadName=Thread-2 2
 * ThreadName=Thread-2 3
 * ThreadName=Thread-2 4
 * ThreadName=Thread-2 5
 * ThreadName=Thread-3 1
 * ThreadName=Thread-3 2
 * ThreadName=Thread-3 3
 * ThreadName=Thread-3 4
 * ThreadName=Thread-3 5
 * ThreadName=Thread-0 1
 * ThreadName=Thread-0 2
 * ThreadName=Thread-0 3
 * ThreadName=Thread-0 4
 * ThreadName=Thread-0 5
 * ThreadName=Thread-1 1
 * ThreadName=Thread-1 2
 * ThreadName=Thread-1 3
 * ThreadName=Thread-1 4
 * ThreadName=Thread-1 5
 * ThreadName=Thread-4 1
 * ThreadName=Thread-4 2
 * ThreadName=Thread-4 3
 * ThreadName=Thread-4 4
 * ThreadName=Thread-4 5
 *
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();

        MyThread myThread1 = new MyThread(myService);
        MyThread myThread2 = new MyThread(myService);
        MyThread myThread3 = new MyThread(myService);
        MyThread myThread4 = new MyThread(myService);
        MyThread myThread5 = new MyThread(myService);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
    }
}
