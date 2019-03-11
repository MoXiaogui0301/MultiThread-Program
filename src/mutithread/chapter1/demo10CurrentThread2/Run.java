package mutithread.chapter1.demo10CurrentThread2;

/**
 * P17
 * Thread.currentThread() Returns a reference to the currently executing thread object.
 * Thread getName() Returns this thread's name.
 * Result:
 * CountOperate---begin
 * Thread.currentThread.getName()=main
 * this.getName()=Thread-0
 * CountOperate---end
 * run---begin
 * Thread.currentThread.getName()=A
 * this.getName()=Thread-0
 * run---end
 * Note:
 * Thread-0是CountOperate c
 */
public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();
    }
}
