package multithread.chapter1.demo22InterruptThreadByForce;

/**
 * P32
 * stop()  Interrupt thread by force. Deprecated. This method is inherently unsafe
 *
 * Result:
 * i=1
 * i=2
 * ...
 * i=7
 * i=8
 * Thread-0 is interrupted by force
 *
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
            System.out.println(thread.getName() + " is interrupted by force");
        }catch (InterruptedException e)    {
            e.printStackTrace();
        }
    }
}
