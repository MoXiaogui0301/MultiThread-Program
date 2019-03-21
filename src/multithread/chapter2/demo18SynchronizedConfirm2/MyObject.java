package multithread.chapter2.demo18SynchronizedConfirm2;

public class MyObject {
    synchronized public void speedPrintString() {
        System.out.println("speedPrintString ______getLock time = " + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
        System.out.println("________________________");
        System.out.println("speedPrintString releaseLock time = " + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
    }
}
