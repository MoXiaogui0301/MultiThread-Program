package mutithread.chapter1.demo31ThreadPriorityInheritance;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run priority = " + Thread.currentThread().getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
