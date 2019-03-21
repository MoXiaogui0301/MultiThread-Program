package multithread.chapter2.demo11SynchronizedCodeBlock;

public class Task {
    public void doLongTimeTask()    {
        for (int i=0;i<15;i++) {
            System.out.println("nosynchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
        }
        System.out.println("");
        synchronized (this) {
            for (int i=0;i<100;i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
            }
        }
    }
}
