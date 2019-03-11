package mutithread.chapter1.demo17interrupted;

/**
 * P27
 * isInterrupted()  Tests whether this thread has been interrupted.
 * 与interrupted()区别在于，isInterrupted()不会清除中断标志位
 *
 * Result:
 * 是否停止1? = true
 * 是否停止2? = true
 */
public class Run3 {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(500);
            thread.interrupt();
            System.out.println("是否停止1? = " + thread.isInterrupted());
            System.out.println("是否停止2? = " + thread.isInterrupted());
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
