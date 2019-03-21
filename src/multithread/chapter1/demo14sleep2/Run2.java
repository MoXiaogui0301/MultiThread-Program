package multithread.chapter1.demo14sleep2;

/**
 * P22
 * main线程与MyThread2线程异步执行
 *
 * Result：
 * begin = 1552277640241
 * end = 1552277640280
 * run threadName = Thread-0 begin = 1552277640280
 * run threadName = Thread-0 end = 1552277642308
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        System.out.println("begin = " + System.currentTimeMillis());
        myThread2.start();
        System.out.println("end = " + System.currentTimeMillis());
    }
}
