package multithread.chapter1.demo27SuspendWeakness1;

public class SynchronizedObject {
    synchronized public void printString()  {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a"))   {
            System.out.println("a线程suspend，独占此对象的printString()");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
