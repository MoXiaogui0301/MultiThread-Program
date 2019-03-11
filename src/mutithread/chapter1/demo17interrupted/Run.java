package mutithread.chapter1.demo17interrupted;

/**
 * P25
 * interrupted()    Tests whether the current thread has been interrupted.
 *
 * Note:
 * 虽然调用了thread.interrupt()，但是thread.interrupted()返回false
 * 说明thread.interrupt()并未停止thread线程
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1? =" + thread.interrupted());
            System.out.println("是否停止2? =" + thread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
