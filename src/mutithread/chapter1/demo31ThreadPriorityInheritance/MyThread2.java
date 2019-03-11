package mutithread.chapter1.demo31ThreadPriorityInheritance;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run priority = " + Thread.currentThread().getPriority());
    }
}
